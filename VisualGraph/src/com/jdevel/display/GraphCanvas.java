package com.jdevel.display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPanel;

import com.jdevel.graph.Edge;
import com.jdevel.graph.Graph;
import com.jdevel.graph.Vertex;

public class GraphCanvas extends JPanel {

	private static final long serialVersionUID = -3873141343968448377L;
	
	private GraphCanvasConfig config;
	
	private Graph graph;
	
	public GraphCanvas(GraphCanvasConfig config, Graph graph) {
		super();
		this.config = config;
		this.graph = graph;
	}
			
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		Graphics2D g2 = (Graphics2D)g;
		RenderingHints rh = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHints(rh);
		
		renderGraph(g2);
	}
	
	private void renderGraph(Graphics2D g2) {
		if (this.graph == null)
			return;
		
		int xOffset = 50;
		int yOffset = 50;
		int spacing = 50;
		
		Set<Vertex> v = this.graph.getVertexSet();
		Set<Edge> e = this.graph.getEdgeSet();
		
		Iterator<Vertex> vItr = v.iterator();
		while (vItr.hasNext()) {
			Vertex next = vItr.next();
			g2.setColor(Color.GREEN);
			g2.drawOval(xOffset, yOffset, config.getVertexDimension().width, config.getVertexDimension().height);
			g2.fillOval(xOffset, yOffset, config.getVertexDimension().width, config.getVertexDimension().height);
			
			g2.setColor(Color.MAGENTA);
			g2.drawString(next.getName(), xOffset+15, yOffset-15);
			
			xOffset += spacing;
			yOffset += spacing;
		}

//		g2.setColor(Color.MAGENTA);
//		g2.drawOval(50, 50, config.getVertexDimension().width, config.getVertexDimension().height);
//		g2.fillOval(50, 50, config.getVertexDimension().width, config.getVertexDimension().height);
//		
//		g2.drawOval(150, 150, config.getVertexDimension().width, config.getVertexDimension().height);
//		g2.fillOval(150, 150, config.getVertexDimension().width, config.getVertexDimension().height);
//		
//		g2.drawOval(150, 50, config.getVertexDimension().width, config.getVertexDimension().height);
//		g2.fillOval(150, 50, config.getVertexDimension().width, config.getVertexDimension().height);
//		
//		g2.setColor(Color.WHITE);
//		g2.setFont(new Font("Helveteca", Font.BOLD, 15));
//		g2.drawString("A", 65, 45);
//		g2.drawString("B", 170, 145);
//		g2.drawString("C", 165, 45);
//		g2.drawString("Graph: G", 50, 200);
//		g2.drawString("V = { A, B, C }", 50, 225);
//		g2.drawString("E = { {A,B}, {A,C}, {B,C} }", 50, 250);
//		
//		g2.setColor(Color.CYAN);
//		g2.drawLine(80, 65, 160, 150);
//		g2.drawLine(80, 65, 150, 65);
//		g2.drawLine(165, 155, 165, 80);
		
	}
	
	public void setGraph(Graph graph) {
		
	}
	
}
