package com.dridco.dss.chess.model.move;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;

/**
 * 
 * @author jdifranco
 * 
 */
public class ChessMove {

	protected Coordinates src;

	protected Coordinates dest;

	protected ChessPiece piece;

	protected ChessMove(Coordinates src, Coordinates dest, ChessPiece piece) {
		this.src = src;
		this.dest = dest;
		this.piece = piece;
	}

	public boolean isCapture() {
		return false;
	}

	public Coordinates getSrc() {
		return src;
	}

	public Coordinates getDest() {
		return dest;
	}

	/******** MOVE DIRECTIONS ****/

	public boolean isNorth() {
		return this.dest.getCol() == this.src.getCol() && this.dest.getRow() > this.src.getRow();
	}

	public boolean isSouth() {
		return this.dest.getCol() == this.src.getCol() && this.dest.getRow() < this.src.getRow();
	}

	public boolean isWest() {
		return this.dest.getCol() < this.src.getCol() && this.dest.getRow() == this.src.getRow();
	}

	public boolean isEast() {
		return this.dest.getCol() > this.src.getCol() && this.dest.getRow() == this.src.getRow();
	}

	public boolean isNorthWest() {
		return this.dest.getCol() < this.src.getCol() && this.dest.getRow() > this.src.getRow();
	}

	public boolean isNorthEast() {
		return this.dest.getCol() > this.src.getCol() && this.dest.getRow() > this.src.getRow();
	}
	
	public boolean isSouthWest() {
		return this.dest.getCol() < this.src.getCol() && this.dest.getRow() < this.src.getRow();
	}

	public boolean isSouthEast() {
		return this.dest.getCol() > this.src.getCol() && this.dest.getRow() < this.src.getRow();
	}
	
	public boolean isVertical() {
		return this.isNorth() || this.isSouth();
	}

	public boolean isHorizontal() {
		return this.isEast() || this.isWest();
	}

	public boolean isDiagonal() {
		int colsDelta = this.dest.getCol() - this.src.getCol();
		int rowsDelta = this.dest.getRow() - this.src.getRow();
		
		return Math.abs(colsDelta) == Math.abs(rowsDelta);
	}
	
	public boolean isBackward() {
		boolean isWhitePieceMovingBackward = this.piece.getColor() == ChessPieceColors.WHITE
				&& this.dest.getRow() < this.src.getRow();
		boolean isBlackPieceMovingBackward = this.piece.getColor() == ChessPieceColors.BLACK
				&& this.dest.getRow() > this.src.getRow();
		return isWhitePieceMovingBackward || isBlackPieceMovingBackward;
	}
	
	/******** END MOVE DIRECTIONS ****/
	
	public boolean arePiecesBetween(ChessBoard board) {
		boolean arePiecesBetweenSquares = false;

		if (this.isNorth()) {
			arePiecesBetweenSquares = arePiecesBetweenSourceAndDest(board,
					this.src.getCol(), this.dest.getCol(), this.src.getRow(),
					this.dest.getRow(), 1, 0);
		} else if (this.isSouth()) {
			arePiecesBetweenSquares = arePiecesBetweenSourceAndDest(board,
					this.src.getCol(), this.dest.getCol(), this.src.getRow(),
					this.dest.getRow(), -1, 0);
		} else if (this.isWest()) {
			arePiecesBetweenSquares = arePiecesBetweenSourceAndDest(board,
					this.src.getCol(), this.dest.getCol(), this.src.getRow(),
					this.dest.getRow(), 0, -1);
		} else if (this.isEast()) {
			arePiecesBetweenSquares = arePiecesBetweenSourceAndDest(board,
					this.src.getCol(), this.dest.getCol(), this.src.getRow(),
					this.dest.getRow(), 0, 1);
		}

		return arePiecesBetweenSquares;
	}

	private boolean arePiecesBetweenSourceAndDest(ChessBoard board,
			char srcCol, char destCol, int srcRow, int destRow,
			int rowIncrement, int colIncrement) {

		int currentRow = srcRow + rowIncrement;
		char currentCol = (char) (srcCol + colIncrement);

		while ((currentRow < destRow || rowIncrement == 0) && (currentCol < destCol || colIncrement == 0)) {
			if (board.getSquareAt(Coordinates.at(currentCol, currentRow))
					.isOccupied()) {
				return true;
			}
			currentRow += rowIncrement;
			currentCol += colIncrement;
		}
		
		
//		do {
//			
//			
//		} while ((currentRow < destRow || rowIncrement == 0) && (currentCol < destCol || colIncrement == 0));

		return false;
	}
	
	public boolean isValid() {
		return this.piece.isMoveValid(this);
	}

}