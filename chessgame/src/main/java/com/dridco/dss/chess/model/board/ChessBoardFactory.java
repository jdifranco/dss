package com.dridco.dss.chess.model.board;

import static com.dridco.dss.chess.model.coordinate.Coordinates.A1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.A8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.B1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.B8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.C1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.C8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.D1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.D8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.E1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.E8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.F1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.F8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.G1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.G8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.H1;
import static com.dridco.dss.chess.model.coordinate.Coordinates.H8;
import static com.dridco.dss.chess.model.coordinate.Coordinates.at;
import static com.dridco.dss.chess.model.piece.ChessPieceColors.BLACK;
import static com.dridco.dss.chess.model.piece.ChessPieceColors.WHITE;
import static com.dridco.dss.chess.model.piece.ChessPiecesFactory.newBishop;
import static com.dridco.dss.chess.model.piece.ChessPiecesFactory.newKing;
import static com.dridco.dss.chess.model.piece.ChessPiecesFactory.newKnight;
import static com.dridco.dss.chess.model.piece.ChessPiecesFactory.newPawn;
import static com.dridco.dss.chess.model.piece.ChessPiecesFactory.newQueen;
import static com.dridco.dss.chess.model.piece.ChessPiecesFactory.newRook;

import java.util.SortedMap;
import java.util.TreeMap;

import com.dridco.dss.chess.model.coordinate.Coordinates;
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
		
		squares.put(A1, SquaresFactory.newOccupiedSquare(newRook(WHITE)));
		squares.put(B1, SquaresFactory.newOccupiedSquare(newKnight(WHITE)));
		squares.put(C1, SquaresFactory.newOccupiedSquare(newBishop(WHITE)));
		squares.put(D1, SquaresFactory.newOccupiedSquare(newQueen(WHITE)));
		squares.put(E1, SquaresFactory.newOccupiedSquare(newKing(WHITE)));
		squares.put(F1, SquaresFactory.newOccupiedSquare(newBishop(WHITE)));
		squares.put(G1, SquaresFactory.newOccupiedSquare(newKnight(WHITE)));
		squares.put(H1, SquaresFactory.newOccupiedSquare(newRook(WHITE)));
		
		squares.put(A8, SquaresFactory.newOccupiedSquare(newRook(BLACK)));
		squares.put(B8, SquaresFactory.newOccupiedSquare(newKnight(BLACK)));
		squares.put(C8, SquaresFactory.newOccupiedSquare(newBishop(BLACK)));
		squares.put(D8, SquaresFactory.newOccupiedSquare(newQueen(BLACK)));
		squares.put(E8, SquaresFactory.newOccupiedSquare(newKing(BLACK)));
		squares.put(F8, SquaresFactory.newOccupiedSquare(newBishop(BLACK)));
		squares.put(G8, SquaresFactory.newOccupiedSquare(newKnight(BLACK)));
		squares.put(H8, SquaresFactory.newOccupiedSquare(newRook(BLACK)));
		
		for(char colName = ChessBoard.FIRST_COL, colIndex = 0; colIndex < ChessBoard.SIZE; colName++, colIndex++) {
			squares.put(at(colName, 2), SquaresFactory.newOccupiedSquare(newPawn(WHITE)));
			squares.put(at(colName, 7), SquaresFactory.newOccupiedSquare(newPawn(BLACK)));
		}
		
		for(char colName = ChessBoard.FIRST_COL, colIndex = 0; colIndex < ChessBoard.SIZE; colName++, colIndex++) {
			for(int row = DEFAULT_FIRST_EMPTY_ROW; row <= DEFAULT_LAST_EMPTY_ROW; row++) {
				Coordinates cord = at(colName, row);
				squares.put(cord, SquaresFactory.newEmptySquare());
			}
		}
		
		ChessBoard board = new ChessBoard(squares);
		
		return board;
	}
	
}
