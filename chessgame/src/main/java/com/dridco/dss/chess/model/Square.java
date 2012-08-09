package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 * 
 */
public final class Square {

	private Coordinate coordinate;
	private Piece piece;

	public Square(Coordinate cord) {
		this(cord, null);
	}
	
	public Square(Coordinate cord, Piece piece) {
		super();
		this.coordinate = cord;
		this.piece = piece;	
	}

	public Integer getRow() {
		return coordinate.getX();
	}
	
	public Integer getCol() {
		return coordinate.getY();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (Square.class.isInstance(obj)) {
			Square pieceToCompare = (Square) obj;
			return this.coordinate.equals(pieceToCompare.coordinate);
		}
		return false;
	}

	public boolean isOccupied() {
		return this.piece != null;
	}
	
	public void putPiece(Piece piece) {
		if(this.isOccupied()) {
			throw new RuntimeException(String.format("The square: %s : %s is already occupied", this.getRow(), this.getCol()));
		}
		this.piece = piece;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(isOccupied()) {
			result.append(piece.getColor().name().charAt(0));
			result.append(piece.getClass().getSimpleName().charAt(0));
		} else {
			result.append("  ");
		}
		return result.toString();
	}
	
}
