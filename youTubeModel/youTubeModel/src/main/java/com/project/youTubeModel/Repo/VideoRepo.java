package com.project.youTubeModel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.youTubeModel.Entity.Video;

public interface VideoRepo extends JpaRepository<Video,Integer> {

}
