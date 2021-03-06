package com.jeffwhenderson.tronRacer.view;

import javax.swing.JFrame;
//import javax.swing.JPanel; // remove unless I add JPanel back in 

@SuppressWarnings("serial")
public class GameBoard extends JFrame {
	private GamePanel myGamePanel;
	
	public GameBoard() {
		super("JRacer");
		myGamePanel = new GamePanel();
		start();
	}
	
	public void start() {
		 setVisible(true);	
		 buildGUI();
	}
	
	private void buildGUI() {
//		JPanel mainContainer = new JPanel();
//		mainContainer.add(myGamePanel);
//		add(mainContainer);
		add(myGamePanel);
		pack();
	}
}
