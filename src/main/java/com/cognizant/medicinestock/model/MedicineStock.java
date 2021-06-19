package com.cognizant.medicinestock.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//This class will be the Entity class and JPA is used to connect this class with database table 
@Entity
@Table(name = "medicine_stock")
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class MedicineStock {
//	Id field will be the auto generated values.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String chemicalComposition;
	private String targetAilment;
	private String pharmacyName;
	// Date of expiry is supported with @Temporal annotation for 
	// allowing smooth communication between database date type and java date type
	@Temporal(TemporalType.DATE)
	private Date dateOfExpiry;
	private int numberOfTabletsInStock;

}
