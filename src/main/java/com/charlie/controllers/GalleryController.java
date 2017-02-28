package com.charlie.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charlie.dao.GalleryDAO;
import com.charlie.entity.PhotoEntity;

@RestController
public class GalleryController {

	@Autowired
	private GalleryDAO galleryDAO;
	
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
	public Page<PhotoEntity> findPhotos() {
		
		return galleryDAO.findAllByOrderByTimestampDesc(new PageRequest(0,4));
	}

	@RequestMapping(value = "/deleteallphotos", method = RequestMethod.GET)
	public void deletePhotos() {
		galleryDAO.deleteAll();
		
	}
}
