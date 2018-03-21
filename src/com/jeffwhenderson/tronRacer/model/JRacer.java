package com.jeffwhenderson.tronRacer.model;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class JRacer {
	private int myX;
	private int myY;
	private Color myColor;
	private List<Point> myTrail;
	// we may want to show the direction in the future.
	
	public int getMyX() {
		return myX;
	}

	public void setMyX(int myX) {
		this.myX = myX;
		myTrail.add(new Point(myX, myY));
	}

	public int getMyY() {
		return myY;
	}

	public void setMyY(int myY) {
		this.myY = myY;
		myTrail.add(new Point(myX, myY));
	}

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public JRacer(final Color theColor) {
		myX = 10;
		myY = 10;
		myColor = theColor;
	}
}
