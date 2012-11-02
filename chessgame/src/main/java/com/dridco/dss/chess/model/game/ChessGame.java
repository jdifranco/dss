package com.dridco.dss.chess.model.game;

import java.util.Stack;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.board.ChessBoardFactory;
import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.move.ChessMove;
import com.dridco.dss.chess.model.move.ChessMovesFactory;
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
	private Stack<ChessMove> movesList;
	
	public ChessGame(ChessPlayer whitePlayer, ChessPlayer blackPlayer) {
		this.board = ChessBoardFactory.newBoard();
		this.whitePlayer = whitePlayer;
		this.blackPlayer = blackPlayer;
		this.currentPlayer = this.whitePlayer;
		this.movesList = new Stack<ChessMove>();
	}
	
	public void movePiece(Coordinates srcCord, Coordinates destCord) {
		Square srcSquare = board.getSquareAt(srcCord);
		Square destSquare = board.getSquareAt(destCord);
		
		// Check for the right turn
		this.checkTurn(srcSquare);
		
		// Build the move
		ChessMove move = this.buildMove(srcCord, destCord, srcSquare, destSquare);
		
		// Make the move
		this.board.doMove(move);
		
		// Add the move to the list
		this.movesList.add(move);
		
		// Change the current player
		this.currentPlayer = this.currentPlayer.equals(this.whitePlayer) ? 
				this.blackPlayer : this.whitePlayer;
	}

	private void checkTurn(Square srcSquare) {
		if(!srcSquare.hasSameColorPiece(currentPlayer.getColor())) {
			throw new RuntimeException("Its " + currentPlayer.getColor().name() + " turn now.");
		}
	}
	
	private ChessMove buildMove(Coordinates srcCord, Coordinates destCord,
			Square srcSquare, Square destSquare) {
		ChessMove move;
		if(destSquare.isOccupied()) {
			move = ChessMovesFactory.newChessCaptureMove(srcCord, destCord, srcSquare.getPiece(), destSquare.getPiece());
		} else {
			move = ChessMovesFactory.newChessMove(srcCord, destCord, srcSquare.getPiece());
		}
		return move;
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
