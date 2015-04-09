package com.musicplayer.views;

import javax.swing.JFrame;

/**
 * Application's main window
 * 
 * @author SCU
 */
public class Window extends JFrame {
	/**
	 * default serial id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor which sets the properties of the window.
	 */
	public Window() {
		setResizable(false);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}

}
