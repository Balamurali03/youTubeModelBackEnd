package com.project.youTubeModel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.youTubeModel.Entity.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer>{

}
