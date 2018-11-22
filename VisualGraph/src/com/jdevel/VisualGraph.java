package com.jdevel;

import javax.swing.SwingUtilities;

import com.jdevel.display.GraphDisplay;

public class VisualGraph {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            new GraphDisplay();
	         }
	      });
	}

}
