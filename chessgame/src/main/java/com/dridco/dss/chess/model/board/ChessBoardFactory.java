package com.dridco.dss.chess.model.board;

import java.util.SortedMap;
import java.util.TreeMap;

import com.dridco.dss.chess.model.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPieceColors;
import com.dridco.dss.chess.model.piece.ChessPiecesFactory;
import com.dridco.dss.chess.model.square.SquareContext;
import com.dridco.dss.chess.model.square.SquaresFactory;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessBoardFactory {
	
	private static int DEFAULT_FIRST_EMPTY_ROW = 3;
	private static int DEFAULT_LAST_EMPTY_ROW = 6;
	
	private ChessBoardFactory () {
		// Dont want an instance of the factory.
	}
	
	public static ChessBoard newBoard() {
		SortedMap<Coordinates, SquareContext> squares = new TreeMap<Coordinates, SquareContext>();
		
		squares.put(Coordinates.A1, SquaresFactory.newOccupiedSquare(Coordinates.A1, ChessPiecesFactory.newRook(ChessPieceColors.WHITE)));
		squares.put(Coordinates.B1, SquaresFactory.newOccupiedSquare(Coordinates.B1, ChessPiecesFactory.newKnight(ChessPieceColors.WHITE)));
		squares.put(Coordinates.C1, SquaresFactory.newOccupiedSquare(Coordinates.C1, ChessPiecesFactory.newBishop(ChessPieceColors.WHITE)));
		squares.put(Coordinates.D1, SquaresFactory.newOccupiedSquare(Coordinates.D1, ChessPiecesFactory.newQueen(ChessPieceColors.WHITE)));
		squares.put(Coordinates.E1, SquaresFactory.newOccupiedSquare(Coordinates.E1, ChessPiecesFactory.newKing(ChessPieceColors.WHITE)));
		squares.put(Coordinates.F1, SquaresFactory.newOccupiedSquare(Coordinates.F1, ChessPiecesFactory.newBishop(ChessPieceColors.WHITE)));
		squares.put(Coordinates.G1, SquaresFactory.newOccupiedSquare(Coordinates.G1, ChessPiecesFactory.newKnight(ChessPieceColors.WHITE)));
		squares.put(Coordinates.H1, SquaresFactory.newOccupiedSquare(Coordinates.H1, ChessPiecesFactory.newRook(ChessPieceColors.WHITE)));
		
		squares.put(Coordinates.A8, SquaresFactory.newOccupiedSquare(Coordinates.A8, ChessPiecesFactory.newRook(ChessPieceColors.BLACK)));
		squares.put(Coordinates.B8, SquaresFactory.newOccupiedSquare(Coordinates.B8, ChessPiecesFactory.newKnight(ChessPieceColors.BLACK)));
		squares.put(Coordinates.C8, SquaresFactory.newOccupiedSquare(Coordinates.C8, ChessPiecesFactory.newBishop(ChessPieceColors.BLACK)));
		squares.put(Coordinates.D8, SquaresFactory.newOccupiedSquare(Coordinates.D8, ChessPiecesFactory.newQueen(ChessPieceColors.BLACK)));
		squares.put(Coordinates.E8, SquaresFactory.newOccupiedSquare(Coordinates.E8, ChessPiecesFactory.newKing(ChessPieceColors.BLACK)));
		squares.put(Coordinates.F8, SquaresFactory.newOccupiedSquare(Coordinates.F8, ChessPiecesFactory.newBishop(ChessPieceColors.BLACK)));
		squares.put(Coordinates.G8, SquaresFactory.newOccupiedSquare(Coordinates.G8, ChessPiecesFactory.newKnight(ChessPieceColors.BLACK)));
		squares.put(Coordinates.H8, SquaresFactory.newOccupiedSquare(Coordinates.H8, ChessPiecesFactory.newRook(ChessPieceColors.BLACK)));
		
		for(char colName = ChessBoard.FIRST_COL; colName <= ChessBoard.LAST_COL; colName++) {
			squares.put(Coordinates.at(colName, 2), SquaresFactory.newOccupiedSquare(Coordinates.at(colName, 2), ChessPiecesFactory.newPawn(ChessPieceColors.WHITE)));
			squares.put(Coordinates.at(colName, 7), SquaresFactory.newOccupiedSquare(Coordinates.at(colName, 7), ChessPiecesFactory.newPawn(ChessPieceColors.BLACK)));
		}
		
		for(char colName = ChessBoard.FIRST_COL; colName <= ChessBoard.LAST_COL; colName++) {
			for(int row = DEFAULT_FIRST_EMPTY_ROW; row <= DEFAULT_LAST_EMPTY_ROW; row++) {
				Coordinates cord = Coordinates.at(colName, row);
				squares.put(cord, SquaresFactory.newEmptySquare(cord));
			}
		}
		
		ChessBoard board = new ChessBoard(squares);	
		
		return board;
	}
	
}
