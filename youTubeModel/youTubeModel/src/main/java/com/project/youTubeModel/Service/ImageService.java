package com.project.youTubeModel.Service;

import java.util.List;

import com.project.youTubeModel.Response.ImageResponse;

public interface ImageService {
	
	ImageResponse uploadImage(ImageResponse image);
	ImageResponse updateImage(ImageResponse image);
	ImageResponse getImage(String imageName);
	List<ImageResponse> getAllImageByCreator(String userName);
	List<ImageResponse> getAllImage();
	String deleteimage(String imageName);

}
