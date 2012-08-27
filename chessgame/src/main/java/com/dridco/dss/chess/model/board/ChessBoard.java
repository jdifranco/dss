package com.dridco.dss.chess.model.board;

import java.util.SortedMap;

import com.dridco.dss.chess.model.Coordinates;
import com.dridco.dss.chess.model.square.SquareContext;

/**
 * 
 * @author jdifranco
 *
 */
public final class ChessBoard {
	
	public static char FIRST_COL = 'A';
	public static char LAST_COL  = 'H';
	public static int SIZE = 8;
	
	private SortedMap<Coordinates, SquareContext> squares;

	protected ChessBoard(SortedMap<Coordinates, SquareContext> squares) {
		super();
		this.squares = squares;
	}

	public boolean isEmpty() {
		return this.squares.isEmpty();
	}
	
	public SquareContext getSquareAt(Coordinates cord) {
		return squares.get(cord);
	}
	
	public void movePiece(Coordinates srcCord, Coordinates destCord) {
		// TODO checkear el estado del tablero Jacke antes y despues de la jugada, etc.
		SquareContext srcSquare = squares.get(srcCord);
		SquareContext destSquare = squares.get(destCord);
		srcSquare.movePiece(destSquare);
	}
	
	@Override
	public String toString() {
		StringBuffer stringBoard = new StringBuffer();
		stringBoard.append("  ");
		for(char colName = ChessBoard.FIRST_COL; colName <= ChessBoard.LAST_COL; colName++) {
			stringBoard.append("   " + colName + "  ");
		}
		stringBoard.append("\n");
		for(int row = ChessBoard.SIZE; row > 0; row--) {
			stringBoard.append("  ");
			for(int col = 0; col < ChessBoard.SIZE; col++) {
				stringBoard.append("!-----");
			}
			stringBoard.append("!\n");
			stringBoard.append( row + " ");
			for(char colName = ChessBoard.FIRST_COL; colName <= ChessBoard.LAST_COL; colName++) {
				Coordinates cord = Coordinates.at(colName, row);
				SquareContext square = squares.get(cord);
				String piece = square.toString();
				stringBoard.append("!  " + piece + " ");
			}
			stringBoard.append("! " + row + "\n");
		}
		stringBoard.append("  ");
		for(int j = 1; j <= ChessBoard.SIZE; j++) {
			stringBoard.append("!-----");
		}
		stringBoard.append("!\n  ");
		for(char colName = ChessBoard.FIRST_COL; colName <= ChessBoard.LAST_COL; colName++) {
			stringBoard.append("   " + colName + "  ");
		}
		return stringBoard.toString();
	}
	
}
