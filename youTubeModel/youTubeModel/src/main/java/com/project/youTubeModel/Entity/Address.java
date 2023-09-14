package com.project.youTubeModel.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String doorNo;
	private String streetName;
	private String area;
	private String city;
	private String district;
	private String state;
	private int pincode;
	
	@OneToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "signup_id",nullable=false)
	 @JsonBackReference
	private SignUpUser signUpUser;

}
