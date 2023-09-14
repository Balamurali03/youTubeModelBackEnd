package com.project.youTubeModel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.youTubeModel.Entity.SignUpUser;

public interface SignUpUserRepo extends JpaRepository<SignUpUser,Integer>{

}
