package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 * 
 */
public final class Square {

	private Piece piece;
	
	public Square() {
		super();	
	}

	public boolean isOccupied() {
		return this.piece != null;
	}
	
	public void putPiece(Piece piece) {
		if(this.isOccupied()) {
			throw new RuntimeException(String.format("The square is already occupied"));
		}
		this.piece = piece;
	}

	public void movePiece(Square destSquare) {
		if(!this.isOccupied()) {
			throw new RuntimeException(String.format("Cannot move piece, the square is empty."));
		}
		destSquare.piece = this.piece;
		this.piece = null;
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
