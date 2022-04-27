package com.example.demo.Models;

import javax.persistence.Entity;

@Entity
public class Category {
	private Integer categoryId;
	private String categoryName;

	public Integer getCategoryId() {
		return categoryId;
	}

	public Category(Integer categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
