package com.project.youTubeModel.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class SignUpCreator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="channel_id")
	private int channelId;
	private String channelName;
	private String description;
	private String userName;
	private String email;
	private long phNo;
	@Lob
    private byte[] channelLogo;
	
	@OneToMany(mappedBy = "signUpCreator", cascade = CascadeType.ALL)
    @JsonManagedReference
	private List<Audio> audio;
	
	@OneToMany(mappedBy = "signUpCreator", cascade = CascadeType.ALL)
    @JsonManagedReference
	private List<Video> video;
	
	@OneToMany(mappedBy = "signUpCreator", cascade = CascadeType.ALL)
    @JsonManagedReference
	private List<Image> image;
	

}
