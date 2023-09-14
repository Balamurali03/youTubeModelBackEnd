package com.project.youTubeModel.Response;

import java.util.List;

import com.project.youTubeModel.Entity.Comment;
import com.project.youTubeModel.Entity.SignUpCreator;

import jakarta.persistence.Lob;
import lombok.Data;
@Data
public class AudioResponse {

	
	private int audioId;
	private String audioName;
	@Lob
    private byte[] audioFile;
	private int likeCount;
	private int dislike;
	private int averageRating;
	private List<Comment> comment;
	private SignUpCreator signUpCreator;
}
