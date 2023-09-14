package com.project.youTubeModel.Response;

import com.project.youTubeModel.Entity.SignUpUser;

import lombok.Data;

@Data
public class AddressResponse {

	private int addressId;
	private String doorNo;
	private String streetName;
	private String area;
	private String city;
	private String district;
	private String state;
	private int pincode;
	private SignUpUser signUpUser;

}
