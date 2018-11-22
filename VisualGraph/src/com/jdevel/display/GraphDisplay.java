package com.jdevel.display;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GraphDisplay extends JFrame {

	private static final long serialVersionUID = -4500717281502396136L;
	
	private GraphDisplayConfiguration displayConfig;
	
	private GraphCanvas canvas;
	
	public GraphDisplay() {
		
		this.displayConfig = new GraphDisplayConfiguration();
		
		this.canvas = new GraphCanvas(this.displayConfig);
		this.canvas.setPreferredSize( new Dimension( displayConfig.getDisplayWidth(), displayConfig.getDisplayHeight() ) );
		
		Container contentPane = this.getContentPane();
		contentPane.add(this.canvas);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setTitle("VisualGraph");
		this.setVisible(true);		
	}
	
	private class GraphCanvas extends JPanel {

		private static final long serialVersionUID = -3873141343968448377L;
		
		private GraphDisplayConfiguration displayConfig;
		
		public GraphCanvas(GraphDisplayConfiguration displayConfig) {
			super();
			this.displayConfig = displayConfig;
		}
				
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			this.setBackground(Color.BLACK);
			
			g.setColor(Color.MAGENTA);
			g.drawOval(50, 50, this.displayConfig.getVertexWidth(), this.displayConfig.getVertexHeight());
			g.fillOval(50, 50, this.displayConfig.getVertexWidth(), this.displayConfig.getVertexHeight());
			
			g.setColor(Color.WHITE);
			g.setFont(new Font("Monospaced", Font.BOLD, 15));
			g.drawString("B", 100, 50);
			
			g.setColor(Color.CYAN);
			g.drawLine(100, 100, 200, 200);
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            new GraphDisplay(); // Let the constructor do the job
	         }
	      });
	}

}
