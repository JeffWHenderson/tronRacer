package com.jeffwhenderson.tronRacer.model;

import java.awt.Color;

public class Board {
	public char[][] myBoardData = new char[20][20];
	private JRacer myHuman;
	
	public Board() {
		// figure this out and fill in array afterwards
		myBoardData = null;
		myHuman = new JRacer(Color.CYAN);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		getBoardData();
		char[][] tempBoard = getBoardData();
		
		for(int i = 0; i < tempBoard.length; i++) {
			for(int j = 0; j < tempBoard[i].length; j++) {
				str.append(tempBoard[i][j]);
			}
			str.append("\n");
		}
		
		str.append(myHuman.getMyX());
		str.append(", ");
		str.append(myHuman.getMyY());
		str.append('\n');
		
		return str.toString();

	}
	
	public char[][] getBoardData() {
		int x = myHuman.getMyX();
		int y = myHuman.getMyY();
		
		for(int i = 0; i < myBoardData.length; i++) {
			for(int j = 0; j < myBoardData[i].length; j++) {
				if(x == i && y == j) {
					myBoardData[i][j] = 'x'; // player token
				} else {
					myBoardData[i][j] = 'b'; // empty
				}
			}
		}
		return myBoardData;
	}
}
