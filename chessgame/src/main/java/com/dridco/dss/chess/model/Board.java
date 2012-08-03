package com.dridco.dss.chess.model;

import java.util.Collections;
import java.util.List;

/**
 * 
 * @author jdifranco
 *
 */
public class Board {
	
	private static final int BOARD_ROWS = 8;
	private static final int BOARD_COLS = 8;
	
	private List<Square> squares;
	
	public Board() {
		this.squares = Collections.emptyList();
		initChessBoard();
	}
	
	private void initChessBoard() {
		
		for (int i = 0; i < BOARD_COLS; i++) {
			for (int j = 0; j < BOARD_ROWS; j++) {
				squares.add(new Square(new SquarePosition(i, j)));
			}
		}
	}
	
}
