package com.project.youTubeModel.Response;

import java.util.List;

import com.project.youTubeModel.Entity.Comment;
import com.project.youTubeModel.Entity.SignUpCreator;

import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class VideoResponse {
	
	private int videoId;
	private String videoName;
	@Lob
    private byte[] videoFile;
	private int likeCount;
	private int dislike;
	private int averageRating;
	private List<Comment> comment;
	private SignUpCreator signUpCreator;

}
