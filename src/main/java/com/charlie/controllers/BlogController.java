package com.charlie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charlie.entity.BlogPostEntity;
import com.charlie.services.BlogService;

@RestController
public class BlogController {
	@Autowired
	private BlogService blogService;

	@RequestMapping(value = "/getblogs", method = RequestMethod.GET)
	public Page<BlogPostEntity> getBlogs() {

		return blogService.getBlogList();
	}

}
