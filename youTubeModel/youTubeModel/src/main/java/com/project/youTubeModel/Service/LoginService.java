package com.project.youTubeModel.Service;

import com.project.youTubeModel.Response.SignUpUserResponse;

public interface LoginService {

	SignUpUserResponse getLoginData(String userName,String password);
}
