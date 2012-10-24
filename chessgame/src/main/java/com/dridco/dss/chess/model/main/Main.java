package com.dridco.dss.chess.model.main;

import java.io.IOException;
import java.util.Scanner;

import com.dridco.dss.chess.model.coordinate.Coordinates;
import com.dridco.dss.chess.model.game.ChessGame;
import com.dridco.dss.chess.model.piece.ChessPieceColors;
import com.dridco.dss.chess.model.player.ChessPlayer;

/**
 * 
 * @author jdifranco
 *
 */
public class Main {
	
	private static ChessGame game;
	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
	
		ChessPlayer whitePlayer = new ChessPlayer("Player 1", ChessPieceColors.WHITE);
		ChessPlayer blackPlayer = new ChessPlayer("Player 2", ChessPieceColors.BLACK);
		game = new ChessGame(whitePlayer, blackPlayer);
		
		while(!game.isGameEndConditionReached()) {
			// Print the board
			System.out.println(game.getStringBoard());
			System.out.println("\n" + game.getCurrentPlayer().getColor().name() + " turn.. Enter move(src-dest): "); 
			
			// Read string
			String move = reader.nextLine();
			
			try {
				if(move.indexOf("-")==-1) {
					throw new RuntimeException("Invalid move, right format is: src-dest ex. A1-A2");
				}
				
				// Parse move
				String srcSquare = move.substring(0, move.indexOf("-")).trim();
				String destSquare = move.substring(move.indexOf("-") + 1).trim();
				
				// Move
				game.movePiece(Coordinates.at(srcSquare), Coordinates.at(destSquare));
				
			} catch (RuntimeException e) {
				System.out.println("\n" + e.getMessage() + " Press Any key to continue.");
				reader.nextLine();
			}
		}
		
	}

}
