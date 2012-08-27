package com.dridco.dss.chess.model.piece;

import org.junit.Before;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.board.ChessBoardFactory;

/**
 * 
 * @author jdifranco
 *
 */
public abstract class ChessPieceTest {
	
	ChessBoard board;
	
	@Before
	public void initChessPieceTest() {
		board = ChessBoardFactory.newBoard();
	}
	
}
