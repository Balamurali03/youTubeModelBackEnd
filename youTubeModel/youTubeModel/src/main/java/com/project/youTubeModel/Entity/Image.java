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
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="image_id")
	private int imageId;
	private String imageName;
	@Lob
    private byte[] imageFile;
	private int likeCount;
	private int dislike;
	private int averageRating;
	
	@OneToMany(mappedBy = "image", cascade = CascadeType.ALL)
    @JsonManagedReference
	private List<Comment> comment;
	
	@ManyToOne(fetch = FetchType.EAGER)
	  @JoinColumn(name = "channel_id",nullable=false)
	private SignUpCreator signUpCreator;

}
