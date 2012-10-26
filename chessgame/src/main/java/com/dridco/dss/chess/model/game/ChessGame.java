package com.dridco.dss.chess.model.game;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.board.ChessBoardFactory;
import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.player.ChessPlayer;
import com.dridco.dss.chess.model.square.Square;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessGame {
	
	private ChessBoard board;
	private ChessPlayer whitePlayer;
	private ChessPlayer blackPlayer;
	private ChessPlayer currentPlayer;
	
	public ChessGame(ChessPlayer whitePlayer, ChessPlayer blackPlayer) {
		this.board = ChessBoardFactory.newBoard();
		this.whitePlayer = whitePlayer;
		this.blackPlayer = blackPlayer;
		this.currentPlayer = this.whitePlayer;
	}
	
	public void movePiece(Coordinates srcCord, Coordinates destCord) {
		// Check for the right turn
		Square srcSquare = board.getSquareAt(srcCord);
		if(!srcSquare.hasSameColorPiece(currentPlayer.getColor())) {
			throw new RuntimeException("Its " + currentPlayer.getColor().name() + " turn now.");
		}
		
		// Make the move
		this.board.movePiece(srcCord, destCord);
		
		// Change the current player
		this.currentPlayer = this.currentPlayer.equals(this.whitePlayer) ? 
				this.blackPlayer : this.whitePlayer;
	}
	
	public ChessPlayer getCurrentPlayer() {
		return currentPlayer;
	}
	
	public String getBoardAsString() {
		return this.board.toString();
	}
	
	public boolean isGameEndConditionReached() {
		// TODO for ever and ever.
		return false;
	}
	
}
