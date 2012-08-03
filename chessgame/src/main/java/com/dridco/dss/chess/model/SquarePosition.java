package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 * 
 */
public final class PiecePosition {

	private Integer row;
	private Integer col;

	public PiecePosition(int row, int col) {
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
		if (PiecePosition.class.isInstance(obj)) {
			PiecePosition pieceToCompare = (PiecePosition) obj;
			return this.getCol().equals(pieceToCompare.getCol())
					&& this.getRow().equals(pieceToCompare.getRow());
		}
		return false;
	}

}
