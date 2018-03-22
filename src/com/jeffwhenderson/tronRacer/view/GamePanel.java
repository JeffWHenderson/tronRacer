package com.jeffwhenderson.tronRacer.view;

import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 600;
	
	public GamePanel() {
		super();
		this.setSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
	}
}
