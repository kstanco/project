package com.charlie.entity;

public class BlogPostEntity {
	private String author;
	private String post;
	
	public BlogPostEntity(String author, String post){
		this.author = author;
		this.post = post;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

}
