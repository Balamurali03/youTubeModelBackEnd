package com.project.youTubeModel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.youTubeModel.Entity.Image;

public interface ImageRepo extends JpaRepository<Image,Integer> {

}
