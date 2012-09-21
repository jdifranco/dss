package com.dridco.dss.chess.util.piece;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;
import com.dridco.dss.chess.model.piece.ChessPieceColors;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessPieceUtil {
	
	public static boolean isMovedVertically(Coordinates srcCord, Coordinates destCord) {
		return destCord.getCol() == srcCord.getCol() && destCord.getRow() != srcCord.getRow();
		
	}

	public static boolean isMovedHorizontally(Coordinates srcCord, Coordinates destCord) {
		return destCord.getCol() != srcCord.getCol() && destCord.getRow() == srcCord.getRow();
	}
	
	public static boolean isMovedDiagonally(Coordinates srcCord, Coordinates destCord) {
		int colsDelta = destCord.getCol() - srcCord.getCol();
		int rowsDelta = destCord.getRow() - srcCord.getRow();
		return Math.abs(colsDelta) == Math.abs(rowsDelta);
	}
	
	public static boolean isMovedBackward(ChessPiece piece, Coordinates srcCord, Coordinates destCord) {
		boolean isWhitePieceMovingBackward = piece.getColor() == 
				ChessPieceColors.WHITE && destCord.getRow() < srcCord.getRow();
		boolean isBlackPieceMovingBackward = piece.getColor() == 
				ChessPieceColors.BLACK && destCord.getRow() > srcCord.getRow();		
		return isWhitePieceMovingBackward || isBlackPieceMovingBackward;
	}
}