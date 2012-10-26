package com.dridco.dss.chess.model.game;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPieceColors;
import com.dridco.dss.chess.model.player.ChessPlayer;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessGameTest {
	
	private ChessPlayer whitePlayer;
	private ChessPlayer blackPlayer;
	private ChessGame game;
	
	@Before
	public void setUp() {
		whitePlayer = new ChessPlayer("Player 1", ChessPieceColors.WHITE);
		blackPlayer = new ChessPlayer("Player 2", ChessPieceColors.BLACK);
		game = new ChessGame(whitePlayer, blackPlayer);
	}
	
	@Test
	public void testGetBoardAsString_shouldReturnNotEmptyString () {
		Assert.assertFalse(game.getBoardAsString().isEmpty());
	}
	
	@Test(expected=RuntimeException.class)
	public void testMovePiece_movingBlackPieceInWhiteTurn_shouldThrowException () {
		game.movePiece(Coordinates.A7, Coordinates.A5);
	}
	
	@Test
	public void testMovePiece_movingWhitePiece_shouldChangeCurrentPlayerToBlack () {
		game.movePiece(Coordinates.A2, Coordinates.A4);
		Assert.assertEquals(ChessPieceColors.BLACK, game.getCurrentPlayer().getColor());
		Assert.assertEquals("Player 2", game.getCurrentPlayer().getName());
		
		game.movePiece(Coordinates.A7, Coordinates.A6);
		Assert.assertEquals(ChessPieceColors.WHITE, game.getCurrentPlayer().getColor());
		Assert.assertEquals("Player 1", game.getCurrentPlayer().getName());
	}
}
