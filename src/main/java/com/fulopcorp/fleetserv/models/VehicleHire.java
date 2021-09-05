package com.fulopcorp.fleetserv.models;

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
public class VehicleHire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@ManyToOne
	@JoinColumn(name = "VEHICLE_ID", insertable = false, updatable = false)
	private Vehicle vehicle;
	private Integer vehicleid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOut;

	private String timeOut;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateIn;

	private String timeIn;

	@ManyToOne
	@JoinColumn(name = "CLIENT_ID", insertable = false, updatable = false)
	private Client client;
	private Integer clientid;

	@ManyToOne
	@JoinColumn(name = "LOCATION_ID", insertable = false, updatable = false)
	private Location location;
	private Integer locationid;

	private String price;

	private String remarks;
}
