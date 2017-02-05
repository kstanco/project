package com.charlie.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GalleryController {

	@RequestMapping(value = "/getphotos", method = RequestMethod.GET)
	public List<String> getPhotos(){
		
		String[] myList = {
		    "resources/photos/1.JPG", 
			"resources/photos/2.JPG", 
			"resources/photos/3.JPG", 
			"resources/photos/4.JPG", 
			"resources/photos/5.JPG", 
			"resources/photos/6.JPG", 
			"resources/photos/7.JPG", 
			"resources/photos/IMG_0001.JPG", 
			"resources/photos/IMG_0002.JPG", 
			"resources/photos/IMG_0004.JPG", 
			"resources/photos/IMG_0005.JPG", 
			"resources/photos/IMG_0006.JPG", 
			"resources/photos/IMG_0007.JPG", 
			"resources/photos/IMG_0008.JPG", 
			"resources/photos/IMG_0009.JPG", 
			"resources/photos/IMG_0016.JPG", 
			"resources/photos/IMG_0019.JPG", 
			"resources/photos/IMG_0020.JPG", 
			"resources/photos/IMG_0041.JPG", 
			"resources/photos/IMG_0059.JPG", 
			"resources/photos/IMG_0064.JPG", 
			"resources/photos/IMG_0067.JPG", 
			"resources/photos/whatsUp.ico"
		};
		
		List<String> photoList = Arrays.asList(myList);
		
		return photoList;
	}
}
