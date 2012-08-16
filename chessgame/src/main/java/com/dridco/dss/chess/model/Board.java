package com.dridco.dss.chess.model;

import java.util.Map;
import java.util.TreeMap;

import com.dridco.dss.chess.util.BoardUtils;


/**
 * 
 * @author jdifranco
 *
 */
public class Board {
	
	public static int BOARD_MAX_WIDTH = 8;
	public static int BOARD_MAX_HEIGHT = 8;
	private Map<Coordinate, Square> squares;

	public Board() {
		this.squares = new TreeMap<Coordinate, Square>();
		for(int i = 1; i <= BOARD_MAX_WIDTH; i++) {
			for(int j = 1; j <= BOARD_MAX_WIDTH; j++) {
				Coordinate cord = Coordinate.at(i, j);
				squares.put(cord, new Square());
			}
		}
	}

	public Map<Coordinate, Square> getSquares() {
		return squares;
	}
	
	public Square getSquareAt(Coordinate cord) {
		return squares.get(cord);
	}
	
	public void putPiece(Coordinate cord, Piece piece) {
		Square square = squares.get(cord);
		if(square == null) {
			throw new RuntimeException(String.format("There is no square existent at: %s", cord.toString()));
		}
		square.putPiece(piece);
	}
	
	public void movePiece(Coordinate srcCord, Coordinate destCord) {
		Square srcSquare = squares.get(srcCord);
		Square destSquare = squares.get(destCord);
		if(srcSquare == null || destSquare == null) {
			throw new RuntimeException("There are no square at that locations");
		}
		srcSquare.movePiece(destSquare);
	}
	
	@Override
	public String toString() {
		StringBuffer stringBoard = new StringBuffer();
		stringBoard.append("  ");
		for(int j = 1; j <= BOARD_MAX_WIDTH; j++) {
			stringBoard.append("   " + BoardUtils.convertIntegerToChessColumnName(j) + "  ");
		}
		stringBoard.append("\n");
		for(int i = BOARD_MAX_HEIGHT; i > 0; i--) {
			stringBoard.append("  ");
			for(int j = BOARD_MAX_WIDTH; j > 0; j--) {
				stringBoard.append("!-----");
			}
			stringBoard.append("!\n");
			stringBoard.append( i + " ");
			for(int j = 1; j <= BOARD_MAX_WIDTH; j++) {
				Coordinate cord = Coordinate.at(i, j);
				Square square = squares.get(cord);
				String piece = square.toString();
				stringBoard.append("!  " + piece + " ");
			}
			stringBoard.append("! " + i + "\n");
		}
		stringBoard.append("  ");
		for(int j = 1; j <= BOARD_MAX_WIDTH; j++) {
			stringBoard.append("!-----");
		}
		stringBoard.append("!\n  ");
		for(int j = 1; j <= BOARD_MAX_WIDTH; j++) {
			stringBoard.append("   " + BoardUtils.convertIntegerToChessColumnName(j) + "  ");
		}
		return stringBoard.toString();
	}
	
}
