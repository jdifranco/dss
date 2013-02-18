package com.dridco.dss.solr.model;

/**
 * 
 * @author jdifranco
 * 
 */
public class Book {

	private String isbn;

	private Language language;

	private Dimensions dimensions;

	private Float weight;

	private Float price;

	private Rating rating;

	private Category category;

	private String brief;

	public Book(String isbn, Language language, Dimensions dimensions,
			Float weight, Float price, Rating rating, Category category,
			String brief) {
		super();
		this.isbn = isbn;
		this.language = language;
		this.dimensions = dimensions;
		this.weight = weight;
		this.price = price;
		this.rating = rating;
		this.category = category;
		this.brief = brief;
	}

	public String getIsbn() {
		return isbn;
	}

	public Language getLanguage() {
		return language;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public Float getWeight() {
		return weight;
	}

	public Float getPrice() {
		return price;
	}

	public Rating getRating() {
		return rating;
	}

	public Category getCategory() {
		return category;
	}

	public String getBrief() {
		return brief;
	}

}
