package com.project.youTubeModel.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentId;
	private String comment;
	private String userName;
	private Date date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "video_id",nullable=false)
	private Video video;
	
	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "audio_id",nullable=false)
	private Audio audio;
	
	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "image_id",nullable=false)
	private Image image;

}
