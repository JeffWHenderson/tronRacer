package com.jeffwhenderson.tronRacer.model;

import java.awt.Color;

public class Board {
	private char[][] myBoardData;
	private JRacer myHuman;
	
	public Board() {
		// figure this out and fill in array afterwards
		myBoardData = null;
		myHuman = new JRacer(Color.CYAN);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(myHuman.getMyX());
		str.append(", ");
		str.append(myHuman.getMyY());
		str.append('\n');
		
		return str.toString();
	}
}
