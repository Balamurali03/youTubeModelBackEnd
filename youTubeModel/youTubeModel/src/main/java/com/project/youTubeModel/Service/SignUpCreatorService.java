package com.project.youTubeModel.Service;

import com.project.youTubeModel.Response.SignUpCreatorResponse;

public interface SignUpCreatorService {
	
	SignUpCreatorResponse saveSignupData(SignUpCreatorResponse signupData);
	String deleteAccount(String userName);

}
