package com.dridco.dss.chess.model.move;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessCaptureMove extends ChessMove {
	
	protected ChessPiece pieceToCapture;
	
	protected ChessCaptureMove(Coordinates src, Coordinates dest, ChessPiece piece, ChessPiece pieceToCapture) {
		super(src, dest, piece);
		this.pieceToCapture = pieceToCapture;
	}
	
	public boolean isCapture() {
		return true;
	}
}