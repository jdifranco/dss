package com.dridco.dss.chess.model.board;

import java.util.SortedMap;
import java.util.TreeMap;

import static com.dridco.dss.chess.model.coordinate.Coordinates.*;
import static com.dridco.dss.chess.model.piece.ChessPieceColors.*;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.piece.ChessPiecesFactory;
import com.dridco.dss.chess.model.square.Square;
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
		SortedMap<Coordinates, Square> squares = new TreeMap<Coordinates, Square>();
		
		squares.put(A1, SquaresFactory.newOccupiedSquareContainer(A1, ChessPiecesFactory.newRook(WHITE)));
		squares.put(B1, SquaresFactory.newOccupiedSquareContainer(B1, ChessPiecesFactory.newKnight(WHITE)));
		squares.put(C1, SquaresFactory.newOccupiedSquareContainer(C1, ChessPiecesFactory.newBishop(WHITE)));
		squares.put(D1, SquaresFactory.newOccupiedSquareContainer(D1, ChessPiecesFactory.newQueen(WHITE)));
		squares.put(E1, SquaresFactory.newOccupiedSquareContainer(E1, ChessPiecesFactory.newKing(WHITE)));
		squares.put(F1, SquaresFactory.newOccupiedSquareContainer(F1, ChessPiecesFactory.newBishop(WHITE)));
		squares.put(G1, SquaresFactory.newOccupiedSquareContainer(G1, ChessPiecesFactory.newKnight(WHITE)));
		squares.put(H1, SquaresFactory.newOccupiedSquareContainer(H1, ChessPiecesFactory.newRook(WHITE)));
		
		squares.put(A8, SquaresFactory.newOccupiedSquareContainer(A8, ChessPiecesFactory.newRook(BLACK)));
		squares.put(B8, SquaresFactory.newOccupiedSquareContainer(B8, ChessPiecesFactory.newKnight(BLACK)));
		squares.put(C8, SquaresFactory.newOccupiedSquareContainer(C8, ChessPiecesFactory.newBishop(BLACK)));
		squares.put(D8, SquaresFactory.newOccupiedSquareContainer(D8, ChessPiecesFactory.newQueen(BLACK)));
		squares.put(E8, SquaresFactory.newOccupiedSquareContainer(E8, ChessPiecesFactory.newKing(BLACK)));
		squares.put(F8, SquaresFactory.newOccupiedSquareContainer(F8, ChessPiecesFactory.newBishop(BLACK)));
		squares.put(G8, SquaresFactory.newOccupiedSquareContainer(G8, ChessPiecesFactory.newKnight(BLACK)));
		squares.put(H8, SquaresFactory.newOccupiedSquareContainer(H8, ChessPiecesFactory.newRook(BLACK)));
		
		for(char colName = ChessBoard.FIRST_COL, colIndex = 0; colIndex < ChessBoard.SIZE; colName++, colIndex++) {
			squares.put(at(colName, 2), SquaresFactory.newOccupiedSquareContainer(at(colName, 2), ChessPiecesFactory.newPawn(WHITE)));
			squares.put(at(colName, 7), SquaresFactory.newOccupiedSquareContainer(at(colName, 7), ChessPiecesFactory.newPawn(BLACK)));
		}
		
		for(char colName = ChessBoard.FIRST_COL, colIndex = 0; colIndex < ChessBoard.SIZE; colName++, colIndex++) {
			for(int row = DEFAULT_FIRST_EMPTY_ROW; row <= DEFAULT_LAST_EMPTY_ROW; row++) {
				Coordinates cord = at(colName, row);
				squares.put(cord, SquaresFactory.newEmptySquareContainer(cord));
			}
		}
		
		ChessBoard board = new ChessBoard(squares);	
		
		return board;
	}
	
}
