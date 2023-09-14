package com.project.youTubeModel.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="video_id")
	private int videoId;
	private String videoName;
	@Lob
    private byte[] videoFile;
	private int likeCount;
	private int dislike;
	private int averageRating;
	
	@OneToMany(mappedBy = "video", cascade = CascadeType.ALL)
    @JsonManagedReference
	private List<Comment> comment;
	
	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "channel_id",nullable=false)
	private SignUpCreator signUpCreator;
}
