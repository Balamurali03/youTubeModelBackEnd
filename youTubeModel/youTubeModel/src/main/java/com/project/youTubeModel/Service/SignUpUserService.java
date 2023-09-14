package com.project.youTubeModel.Service;

import com.project.youTubeModel.Response.SignUpUserResponse;

public interface SignUpUserService {

	SignUpUserResponse saveSignupData(SignUpUserResponse signupData);
	String deleteAccount(String userName);
}
