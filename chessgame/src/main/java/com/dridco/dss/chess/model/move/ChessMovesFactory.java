package com.dridco.dss.chess.model.move;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;



/**
 * Moves factory.
 * 
 * @author jdifranco
 *
 */
public class ChessMovesFactory {
	
	private ChessMovesFactory () {
		// Dont want an instance of the factory.
	}
	
	public static ChessMove newChessMove(Coordinates src, Coordinates dest, ChessPiece piece) {
		return new ChessMove(src, dest, piece);
	}
	
	public static ChessMove newChessCaptureMove(Coordinates src, Coordinates dest, ChessPiece piece, ChessPiece pieceToCapture) {
		return new ChessCaptureMove(src, dest, piece, pieceToCapture);
	}
	
}
