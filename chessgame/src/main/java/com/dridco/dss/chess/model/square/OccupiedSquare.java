package com.dridco.dss.chess.model.square;

/**
 * 
 * @author jdifranco
 * 
 */
public class OccupiedSquare extends Square {

	@Override
	public boolean isOccupied() {
		return true;
	}

	@Override
	public void movePiece(SquareContext srcSquare, SquareContext destSquare) {
		// TODO (Por ahora se esta asumiendo que esta vacio el dest Square y que
		// el movimiento siempre es valido
		// 1 - Checkear si es un movimiento valido para esa pieza.
		// 2 - Checkear si esta ocupado el dest square:
		// a) En ese caso de ser pieza del mismo color, el movimiento es
		// invalido.
		// b) En caso de que es una pieza de otro color, ver si la puede
		// capturar.
		if (!srcSquare.piece.isMoveValid(srcSquare.coordinates,
				destSquare.coordinates)) {
			throw new RuntimeException("Piece cannot make this move.");
		}
		destSquare.square = new OccupiedSquare();
		destSquare.piece = srcSquare.piece;
		srcSquare.piece = null;
		srcSquare.square = new EmptySquare();
	}

	@Override
	public String toString(SquareContext square) {
		StringBuffer result = new StringBuffer();
		result.append(square.piece.getColor().name().charAt(0));
		result.append(square.piece.getClass().getSimpleName().charAt(0));
		return result.toString();
	}

}
