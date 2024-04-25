package com.dauphine.blogger.controller;

import java.time.LocalDateTime;

public class Post {

	
	private int id;
	private String title;
	private String content;
	private int category_id;
	private LocalDateTime date_création;
	
	public Post(int id, String title, String content, int category_id, LocalDateTime date_création) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.category_id = category_id;
		this.date_création = date_création;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public LocalDateTime getDate_création() {
		return date_création;
	}

	public void setDate_création(LocalDateTime date_création) {
		this.date_création = date_création;
	}
	
	

	
}
