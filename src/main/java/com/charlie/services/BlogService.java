package com.charlie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.charlie.dao.BlogDAO;
import com.charlie.entity.BlogPostEntity;

@Service
public class BlogService {
	@Autowired
	private BlogDAO blog;

	public Page<BlogPostEntity> getBlogList() {

		// blogList.add(createBlogEntity("John", "Just Forgot that I had to
		// mention something about someone to someone about how I forgot
		// something, but now I forgot it. Ahh, forget it! Or wait. I
		// remember.... no I don't."));
		// blogList.add(createBlogEntity("Mary", "Just Forgot that I had to
		// mention something about someone to someone about how I forgot
		// something, but now I forgot it. Ahh, forget it! Or wait. I
		// remember.... no I don't."));
		// blogList.add(createBlogEntity("Paul", "Just Forgot that I had to
		// mention something about someone to someone about how I forgot
		// something, but now I forgot it. Ahh, forget it! Or wait. I
		// remember.... no I don't."));
		// blogList.add(createBlogEntity("Jane", "Just Forgot that I had to
		// mention something about someone to someone about how I forgot
		// something, but now I forgot it. Ahh, forget it! Or wait. I
		// remember.... no I don't."));

		return blog.findAllByOrderByTimestampDesc(new PageRequest(0, 10));

	}

	private static BlogPostEntity createBlogEntity(String author, String post) {

		return new BlogPostEntity(author, post);
	}
}
