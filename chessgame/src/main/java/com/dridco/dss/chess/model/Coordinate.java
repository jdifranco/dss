package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 * 
 */
public class Coordinate implements Comparable<Coordinate> {

	private Integer x;
	private Integer y;

	private Coordinate(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public static Coordinate at(Integer x, Integer y) {
		return new Coordinate(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this.getClass().isInstance(obj)) {
			Coordinate coordinateToCompare = (Coordinate) obj;
			return this.x.equals(coordinateToCompare.x)
					&& this.y.equals(coordinateToCompare.y);
		}
		return false;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	@Override
	public String toString() {
		return x + ":" + y;
	}

	@Override
	public int compareTo(Coordinate o) {
		int comparation = 1;
		if(this.x.equals(o.x) && this.y.equals(o.y)) { 
			comparation = 0; 
		} else if (this.x < o.x || (this.x.equals(o.x) && this.y < o.y)) {
			comparation = -1;
		}
		return comparation;
	}
}
