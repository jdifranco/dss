package com.dridco.dss.chess.model.square;


/**
 * 
 * @author jdifranco
 * 
 */
public enum Squares {

	EMPTY {
		@Override
		public boolean isOccupied() {
			return false;
		}

		@Override
		public void movePiece(SquareContext srcSquare, SquareContext destSquare) {
			throw new RuntimeException("This square is empty");			
		}

		@Override
		public String toString(SquareContext square) {
			return "  ";
		}
		
	}, OCCUPIED {
		@Override
		public boolean isOccupied() {
			return true;
		}

		@Override
		public void movePiece(SquareContext srcSquare, SquareContext destSquare) {
			// TODO (Por ahora se esta asumiendo que esta vacio el dest Square y que el movimiento siempre es valido
			// 1 - Checkear si es un movimiento valido para esa pieza.
			// 2 - Checkear si esta ocupado el dest square:
			//  a) En ese caso de ser pieza del mismo color, el movimiento es invalido.
			//  b) En caso de que es una pieza de otro color, ver si la puede capturar.
			destSquare.square = OCCUPIED;
			destSquare.piece = srcSquare.piece;
			srcSquare.piece = null;
			srcSquare.square = EMPTY;
		}

		@Override
		public String toString(SquareContext square) {
			StringBuffer result = new StringBuffer();
			result.append(square.piece.getColor().name().charAt(0));
			result.append(square.piece.getClass().getSimpleName().charAt(0));
			return result.toString();
		}
	};
	
	public abstract boolean isOccupied();
	
	public abstract void movePiece(SquareContext srcSquare, SquareContext destSquare);
	
	public abstract String toString(SquareContext square);	
	
}
