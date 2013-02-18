package com.dridco.dss.solr.model;

/**
 * 
 * @author jdifranco
 * 
 */
public enum Rating {

	ONE_STAR(1), TWO_STAR(2), THREE_STAR(3), FOUR_STAR(4), FIVE_STAR(5);

	private Integer value;

	private Rating(Integer value) {
		this.value = value;
	}

	public static Rating forValue(Integer value) {
		for (Rating rating : values()) {
			if (rating.getValue().equals(value)) {
				return rating;
			}
		}
		throw new RuntimeException("Invalid rating selected");
	}

	public Integer getValue() {
		return this.value;
	}
	
}
