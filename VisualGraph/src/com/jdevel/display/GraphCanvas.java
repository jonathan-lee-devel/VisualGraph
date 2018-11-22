package com.jdevel.display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphCanvas extends JPanel {

	private static final long serialVersionUID = -3873141343968448377L;
	
	private GraphCanvasConfig config;
	
	public GraphCanvas(GraphCanvasConfig config) {
		super();
		this.config = config;
	}
			
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(50, 50, config.getVertexDimension().width, config.getVertexDimension().height);
		g.fillOval(50, 50, config.getVertexDimension().width, config.getVertexDimension().height);
		
		g.drawOval(150, 150, config.getVertexDimension().width, config.getVertexDimension().height);
		g.fillOval(150, 150, config.getVertexDimension().width, config.getVertexDimension().height);
		
		g.drawOval(150, 50, config.getVertexDimension().width, config.getVertexDimension().height);
		g.fillOval(150, 50, config.getVertexDimension().width, config.getVertexDimension().height);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Monospaced", Font.BOLD, 15));
		g.drawString("A", 65, 45);
		g.drawString("B", 170, 145);
		g.drawString("C", 165, 45);
		
		g.setColor(Color.CYAN);
		g.drawLine(80, 65, 160, 150);
		g.drawLine(80, 65, 150, 65);
		g.drawLine(165, 155, 165, 80);
	}
	
}
