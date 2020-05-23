package com.dev.testcasespro.models;

import com.google.gson.annotations.SerializedName;

public class Todo{

	@SerializedName("id")
	private int id;

	@SerializedName("completed")
	private boolean completed;

	@SerializedName("title")
	private String title;

	@SerializedName("userId")
	private int userId;

	public int getId(){
		return id;
	}

	public boolean isCompleted(){
		return completed;
	}

	public String getTitle(){
		return title;
	}

	public int getUserId(){
		return userId;
	}
}