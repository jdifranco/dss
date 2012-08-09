package com.dridco.dss.chess.model;

/**
 * 
 * @author jdifranco
 *
 */
public class Game {
	
	private Board board;
	
	public Game() {
		
	}
	
	public void initBoard() {
		board = new Board();
	}
	
	public Board getBoard() {
		return board;
	}
	
}
