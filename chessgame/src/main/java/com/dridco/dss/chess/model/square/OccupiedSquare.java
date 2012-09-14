package com.dridco.dss.chess.model.square;

import com.dridco.dss.chess.model.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiece;

/**
 * 
 * @author jdifranco
 * 
 */
public class OccupiedSquare extends Square {

	public OccupiedSquare(Coordinates cords) {
		super(cords);
	}
	
	public OccupiedSquare(Coordinates cords, ChessPiece piece) {
		super(cords);
		this.piece = piece;
	}

	@Override
	public boolean isOccupied() {
		return true;
	}

	@Override
	public void movePiece(SquareContainer srcSquare, SquareContainer destSquare) {
		// TODO (Por ahora se esta asumiendo que esta vacio el dest Square y que
		// el movimiento siempre es valido
		// 1 - Checkear si es un movimiento valido para esa pieza. (Listo)
		// 2 - Checkear si esta ocupado el dest square:
		// a) En ese caso de ser pieza del mismo color, el movimiento es
		// invalido.
		// b) En caso de que es una pieza de otro color, ver si la puede
		// capturar.
		ChessPiece piece = this.piece;
		if (!piece.isMoveValid(this.coordinates,
				destSquare.square.coordinates)) {
			throw new RuntimeException("Piece cannot make this move.");
		}
		piece.moveTo(srcSquare, destSquare);
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(piece.getColor().name().charAt(0));
		result.append(piece.getClass().getSimpleName().charAt(0));
		return result.toString();
	}

}
