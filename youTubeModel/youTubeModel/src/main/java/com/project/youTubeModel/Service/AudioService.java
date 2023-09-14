package com.project.youTubeModel.Service;

import java.util.List;

import com.project.youTubeModel.Response.AudioResponse;

public interface AudioService {

	AudioResponse uploadMusic(AudioResponse audio);
	AudioResponse updateMusic(AudioResponse audio);
	AudioResponse getAudio(String audioName);
	List<AudioResponse> getAllAudioByCreator(String userName);
	List<AudioResponse> getAllAudio();
	String deleteAudio(String audioName);
	
}
