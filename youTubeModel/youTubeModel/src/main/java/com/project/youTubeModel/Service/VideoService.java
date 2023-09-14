package com.project.youTubeModel.Service;

import java.util.List;

import com.project.youTubeModel.Response.VideoResponse;

public interface VideoService {
	
	VideoResponse uploadVideo(VideoResponse video);
	VideoResponse updateVideo(VideoResponse video);
	VideoResponse getVideo(String videoName);
	List<VideoResponse> getAllVideoByCreator(String userName);
	List<VideoResponse> getAllVideo();
	String deleteVideo(String videoName);

}
