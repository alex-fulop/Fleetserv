package com.fulopcorp.fleetserv.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ID")
public class VehicleMovement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@ManyToOne
	@JoinColumn(name = "VEHICLE_ID", insertable = false, updatable = false)
	private Vehicle vehicle;
	private int vehicleid;

	@ManyToOne
	@JoinColumn(name = "LOCATION_ID_1", insertable = false, updatable = false)
	private Location location1;
	private int locationid1;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date1;

	@ManyToOne
	@JoinColumn(name = "LOCATION_ID_2", insertable = false, updatable = false)
	private Location location2;
	private int locationid2;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date2;

	private String remarks;
}
