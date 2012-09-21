package com.dridco.dss.chess.model.main;

import java.io.IOException;
import java.util.Scanner;

import com.dridco.dss.chess.model.board.ChessBoard;
import com.dridco.dss.chess.model.board.ChessBoardFactory;
import com.dridco.dss.chess.model.coordinate.Coordinates;

/**
 * 
 * @author jdifranco
 *
 */
public class ChessGame {
	
	private static ChessBoard board;
	
	public static void main(String[] args) throws IOException {
		board = ChessBoardFactory.newBoard();
		Scanner sc = new Scanner(System.in);
		boolean isJackMate = false;
		
		while(!isJackMate) {
			System.out.println(board.toString());
			System.out.println("\nSrc Square: "); 
			String srcSquare = sc.nextLine();
			System.out.println("\nDest Square: "); 
			String destSquare = sc.nextLine();
			
			try {
				board.movePiece(Coordinates.at(srcSquare), Coordinates.at(destSquare));
			} catch (RuntimeException e) {
				System.out.println("\n" + e.getMessage() + " Press Any key to continue.");
				sc.nextLine();
			}
		}
		
	}
	
}
