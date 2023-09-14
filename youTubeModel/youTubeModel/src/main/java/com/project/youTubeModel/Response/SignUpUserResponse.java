package com.project.youTubeModel.Response;

import com.project.youTubeModel.Entity.Address;

import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class SignUpUserResponse {
	
	private int signupId;
	private String userName;
	private String firstName;
	private String lastName;
	private String pasword;
	private String email;
	private long phNo;
	private String dob;
	private boolean creator;
	@Lob
    private byte[] profilePic;
	private Address address;

}
