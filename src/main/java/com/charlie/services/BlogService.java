package com.charlie.services;

import java.util.ArrayList;
import java.util.List;

import com.charlie.entity.BlogPostEntity;

public class BlogService {
	public static List<BlogPostEntity> getBlogList() {
		List<BlogPostEntity> blogList = new ArrayList<BlogPostEntity>();
		
		blogList.add(createBlogEntity("John", "Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't."));
		blogList.add(createBlogEntity("Mary", "Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't."));
		blogList.add(createBlogEntity("Paul", "Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't."));
		blogList.add(createBlogEntity("Jane", "Just Forgot that I had to mention something about someone to someone about how I forgot something, but now I forgot it. Ahh, forget it! Or wait. I remember.... no I don't."));

		return blogList;
		
	}
	
	private static BlogPostEntity createBlogEntity(String author, String post){
		
		return new BlogPostEntity(author, post);
	}
}


