package com.dridco.dss.chess.model.player;

import com.dridco.dss.chess.model.piece.ChessPieceColors;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessPlayer {
	
	private String name;
	private ChessPieceColors color;
		
	public ChessPlayer(String name, ChessPieceColors color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}
		
	public ChessPieceColors getColor() {
		return color;
	}
	
}
