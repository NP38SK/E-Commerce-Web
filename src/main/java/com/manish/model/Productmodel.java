package com.manish.model;

public class Productmodel {

	private String name;
	private String category;
	private String price;
	private String images;

	public Productmodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Productmodel(String name, String category, String price, String images) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Productmodel [name=" + name + ", category=" + category + ", price=" + price + ", images=" + images
				+ "]";
	}

}
