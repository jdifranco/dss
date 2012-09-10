package com.dridco.dss.chess.model;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessGameTest {
	
	private ChessGame chessGame;
	
	@Before
	public void setUp() {
		chessGame = new ChessGame();
	}
	
	@Test
	public void testInitBoard_boardHasbeenCreatedSuccessFully() {
		Assert.assertFalse(chessGame.getBoard().isEmpty());
	}
	
	@Test
	public void showBoard() {
		System.out.println(chessGame.getBoard().toString());
	}
	
}
