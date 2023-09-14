package com.project.youTubeModel.Response;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class LoginResponse {
	
	private int loginId;
	private String userName;
	private String pasword;
	private List<Date> loginTime;


}
