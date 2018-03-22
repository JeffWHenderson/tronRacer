package com.jeffwhenderson.tronRacer.view;

import com.jeffwhenderson.tronRacer.model.Board;

public class JRacerMain {
	private static Board myBoard;
	private static GameBoard myGameBoard;

	public static void main(String[] args) {
		//represents the board backend
		myBoard = new Board();
		System.out.println(myBoard);
		
		//represents the view
		myGameBoard = new GameBoard();
		myGameBoard.start();
	}

}
