package com.dridco.dss.chess.model.board;

import java.util.SortedMap;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.square.Square;
import com.dridco.dss.chess.util.board.ChessBoardUtil;

/**
 * 
 * @author jdifranco
 *
 */
public final class ChessBoard {
	
	public static char FIRST_COL = 'A';
	public static char LAST_COL = 'H';
	public static int SIZE = 8;
	
	private SortedMap<Coordinates, Square> squares;

	protected ChessBoard(SortedMap<Coordinates, Square> squares) {
		super();
		this.squares = squares;
	}
	
	public Square getSquareAt(Coordinates cord) {
		return squares.get(cord);
	}
	
	public void movePiece(Coordinates srcCord, Coordinates destCord) {
		Square srcSquare = squares.get(srcCord);
		Square destSquare = squares.get(destCord);
		
		if(ChessBoardUtil.arePiecesBetweenSquares(this,srcCord, destCord)) {
			throw new RuntimeException("Invalid move, there are pieces between.");
		}
		
		srcSquare.movePiece(destSquare);
	}
	
	@Override
	public String toString() {
		StringBuffer stringBoard = new StringBuffer();
		stringBoard.append("  ");
		for(char colName = ChessBoard.FIRST_COL, colIndex = 0; colIndex < ChessBoard.SIZE; colName++, colIndex++) {
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
			for(char colName = ChessBoard.FIRST_COL, colIndex = 0; colIndex < ChessBoard.SIZE; colName++, colIndex++) {
				Coordinates cord = Coordinates.at(colName, row);
				Square square = squares.get(cord);
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
		for(char colName = ChessBoard.FIRST_COL, colIndex = 0; colIndex < ChessBoard.SIZE; colName++, colIndex++) {
			stringBoard.append("   " + colName + "  ");
		}
		return stringBoard.toString();
	}
	
}
