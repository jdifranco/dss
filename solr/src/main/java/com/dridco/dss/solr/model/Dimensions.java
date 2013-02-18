package com.dridco.dss.solr.model;

/**
 * 
 * @author jdifranco
 *
 */
public class Dimensions {
	
	private Float height;
	
	private Float width;
	
	private Float lenght;
	
	public Dimensions(Float height, Float width, Float lenght) {
		this.height = height;
		this.width = width;
		this.lenght = lenght;
	}
		
	public Float getHeight() {
		return this.height;
	}

	public Float getWidth() {
		return this.width;
	}

	public Float getLenght() {
		return this.lenght;
	}
	
}
