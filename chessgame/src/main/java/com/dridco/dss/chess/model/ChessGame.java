package com.dridco.dss.chess.model;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.board.ChessBoardFactory;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessGame {
	
	private ChessBoard board;
		
	public ChessGame() {
		this.initBoard();
	}
	
	private void initBoard() {
		board = ChessBoardFactory.newBoard();
	}	
		
	public ChessBoard getBoard() {
		return board;
	}
	
}
