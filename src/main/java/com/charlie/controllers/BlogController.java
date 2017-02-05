package com.charlie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charlie.entity.BlogPostEntity;
import com.charlie.services.BlogService;

@RestController
public class BlogController {
	
	@RequestMapping(value = "/getblogs", method = RequestMethod.GET)
	public List<BlogPostEntity> getBlogs(){
		
		return BlogService.getBlogList();
	}

}

