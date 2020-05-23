package com.dev.testcasespro.models;

import com.google.gson.annotations.SerializedName;

public class Comment {

	@SerializedName("name")
	private String name;

	@SerializedName("postId")
	private int postId;

	@SerializedName("id")
	private int id;

	@SerializedName("body")
	private String body;

	@SerializedName("email")
	private String email;

	public String getName(){
		return name;
	}

	public int getPostId(){
		return postId;
	}

	public int getId(){
		return id;
	}

	public String getBody(){
		return body;
	}

	public String getEmail(){
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}