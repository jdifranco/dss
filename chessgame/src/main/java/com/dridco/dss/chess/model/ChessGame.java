package com.dridco.dss.chess.model;

import java.util.HashMap;

public class ChessGame {
	
	private Board board;
	
	public ChessGame() {
		
	}
	
	public void initBoard() {
		board = new Board(new HashMap<PiecePosition, Piece>());
	}
	
	public Board getBoard() {
		return board;
	}
	
}
