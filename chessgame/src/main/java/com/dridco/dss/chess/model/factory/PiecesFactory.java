package com.dridco.dss.chess.model.factory;

import com.dridco.dss.chess.model.Pawn;
import com.dridco.dss.chess.model.PieceColor;

/**
 * 
 * @author jdifranco
 *
 */
public class PiecesFactory {
	
	private PiecesFactory () {
		
	}
	
	public static Pawn createPawn(PieceColor color) {
		return new Pawn(color);
	}
}
