package com.project.youTubeModel.Response;

import java.util.Date;

import com.project.youTubeModel.Entity.Audio;
import com.project.youTubeModel.Entity.Image;
import com.project.youTubeModel.Entity.Video;

import lombok.Data;

@Data
public class CommentResponse {
	
	private int commentId;
	private String comment;
	private String userName;
	private Date date;
	private Video video;
	private Audio audio;
	private Image image;


}
