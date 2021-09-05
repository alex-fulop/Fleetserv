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
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String name;
	@ManyToOne
	@JoinColumn(name = "VEHICLE_TYPE_ID", insertable = false, updatable = false)
	private VehicleType vehicleType;
	private Integer vehicletypeid;

	private String vehicleNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	private String description;

	@ManyToOne
	@JoinColumn(name = "VEHICLE_MAKE_ID", insertable = false, updatable = false)
	private VehicleMake vehicleMake;
	private Integer vehiclemakeid;

	private String power;
	private String fuelCapacity;
	@ManyToOne
	@JoinColumn(name = "VEHICLE_STATUS_ID", insertable = false, updatable = false)
	private VehicleStatus vehicleStatus;
	private Integer vehiclestatusid;

	private String netWeight;

	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID", insertable = false, updatable = false)
	private Employee inCharge;
	private Integer employeeid;

	@ManyToOne
	@JoinColumn(name = "VEHICLE_MODEL_ID", insertable = false, updatable = false)
	private VehicleModel vehicleModel;
	private Integer vehiclemodelid;

	@ManyToOne
	@JoinColumn(name = "LOCATION_ID", insertable = false, updatable = false)
	private Location currentLocation;
	private Integer locationid;

	private String remarks;
}
