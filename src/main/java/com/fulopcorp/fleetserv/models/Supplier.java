package com.fulopcorp.fleetserv.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ID")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String name;
	private String address;
	private String city;
	private String phone;
	private String mobile;
	private String website;
	private String email;

	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID", insertable = false, updatable = false)
	private Country country;
	private Integer countryid;

	@ManyToOne
	@JoinColumn(name = "STATE_ID", insertable = false, updatable = false)
	private State state;
	private Integer stateid;

	private String details;
}
