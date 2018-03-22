package com.jeffwhenderson.tronRacer.view;

import com.jeffwhenderson.tronRacer.model.Board;

public class JRacerMain {
	private static Board myBoard;
	private static GameBoard myGameBoard;

	public static void main(String[] args) {
		myBoard = new Board();
		System.out.println(myBoard);
		
		myGameBoard = new GameBoard();
		myGameBoard.start();
	}

}
