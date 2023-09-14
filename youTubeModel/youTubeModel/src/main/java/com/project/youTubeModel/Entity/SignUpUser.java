package com.project.youTubeModel.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class SignUpUser {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="signup_id")
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
	@OneToOne(mappedBy = "signUpUser", cascade = CascadeType.ALL)
    @JsonManagedReference
	private Address address;
}
