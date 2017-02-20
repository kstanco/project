package com.charlie.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charlie.dao.GalleryDAO;
import com.charlie.entity.PhotoEntity;
import com.charlie.services.GalleryService;

@RestController
public class GalleryController {

	@Autowired
	private GalleryDAO galleryDAO;
	
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
	
	@RequestMapping(value = "/postphotos", method = RequestMethod.POST)
	public void postPhotos(@RequestBody List<String>photoList){
		
//		GalleryService gs = new GalleryService();
//		gs.savePhotos(photoList);
		List<PhotoEntity> photoEntityList = new ArrayList<PhotoEntity>();
		for (int i = 0; i < photoList.size(); i++) {
			PhotoEntity pe = new PhotoEntity(i);
			pe.setPhotoBlob(photoList.get(i));	
			photoEntityList.add(pe);
		}
		galleryDAO.save(photoEntityList);
	
	}
	
	@RequestMapping(value = "/findphotos", method = RequestMethod.GET)
	public List<PhotoEntity> findPhotos() {
		
		return galleryDAO.findAll();
	}

	
}
