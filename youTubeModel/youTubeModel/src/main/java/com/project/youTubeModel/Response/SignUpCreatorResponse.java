package com.project.youTubeModel.Response;

import java.util.List;

import com.project.youTubeModel.Entity.Audio;
import com.project.youTubeModel.Entity.Image;
import com.project.youTubeModel.Entity.Video;

import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class SignUpCreatorResponse {
	
	private int channelId;
	private String channelName;
	private String description;
	private String userName;
	private String email;
	private long phNo;
	@Lob
    private byte[] channelLogo;
	private List<Audio> audio;
	private List<Video> video;
	private List<Image> image;
	


}
