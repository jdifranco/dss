package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 * 
 */
public final class SquarePosition {

	private Integer row;
	private Integer col;

	public SquarePosition(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public Integer getCol() {
		return col;
	}

	public Integer getRow() {
		return row;
	}

	@Override
	public boolean equals(Object obj) {
		if (SquarePosition.class.isInstance(obj)) {
			SquarePosition pieceToCompare = (SquarePosition) obj;
			return this.getCol().equals(pieceToCompare.getCol())
					&& this.getRow().equals(pieceToCompare.getRow());
		}
		return false;
	}

}
