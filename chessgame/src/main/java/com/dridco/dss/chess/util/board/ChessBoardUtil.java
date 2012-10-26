package com.dridco.dss.chess.util.board;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.util.piece.ChessPieceUtil;

/**
 * 
 * @author jdifranco
 *
 */
public final class ChessBoardUtil {
	
	public static boolean arePiecesBetweenSquares(ChessBoard board, Coordinates srcCord, Coordinates destCord) {
		
		boolean arePiecesBetweenSquares = false;
				
		if(ChessPieceUtil.isNorthMoved(srcCord, destCord)) {
			arePiecesBetweenSquares = 
					arePiecesBetweenSourceAndDest(board, srcCord.getCol(), destCord.getCol(), srcCord.getRow(), destCord.getRow(), 1, 0);
		} else if(ChessPieceUtil.isSouthMoved(srcCord, destCord)) {
			arePiecesBetweenSquares = 
					arePiecesBetweenSourceAndDest(board, srcCord.getCol(), destCord.getCol(), srcCord.getRow(), destCord.getRow(), -1, 0);
		} else if(ChessPieceUtil.isWestMoved(srcCord, destCord)) {
			arePiecesBetweenSquares = 
					arePiecesBetweenSourceAndDest(board, srcCord.getCol(), destCord.getCol(), srcCord.getRow(), destCord.getRow(), 0, -1);
		} else if(ChessPieceUtil.isEastMoved(srcCord, destCord)) {
			arePiecesBetweenSquares = 
					arePiecesBetweenSourceAndDest(board, srcCord.getCol(), destCord.getCol(), srcCord.getRow(), destCord.getRow(), 0, 1);
		}
		
		return arePiecesBetweenSquares;
	}
	
	private static boolean arePiecesBetweenSourceAndDest(ChessBoard board, char srcCol, char destCol, int srcRow, 
			int destRow, int rowIncrement, int colIncrement) {
		
		int currentRow = srcRow + rowIncrement;
		char currentCol = (char) (srcCol + colIncrement);
		
		do {
			if(board.getSquareAt(Coordinates.at(currentCol, currentRow)).isOccupied()) {
				return true;
			}
			currentRow += rowIncrement;
			currentCol += colIncrement;
		} while(currentRow < destRow && currentCol < destCol);
		
		return false;
		
	}
	
}
