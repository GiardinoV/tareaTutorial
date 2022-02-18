package com.books.integrate.spring.react.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

	@Column(name = "price")
	private float price;

	public Tutorial() {

	}

	public Tutorial(String description, boolean published) {
		this.description = description;
		this.published = published;
	}

	public Tutorial(String title, String description, boolean published, float price) {
		this.title = title;
		this.description = description;
		this.published = published;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {

		return published;
	}

	public void setPublished(boolean isPublished) {

		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", published=" + published +
				", price=" + price +
				'}';
	}
}
