package com.jdevel.display;

import com.jdevel.graph.Edge;
import com.jdevel.graph.Graph;
import com.jdevel.graph.Vertex;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.Set;

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
	}
		
	public void setGraph(Graph graph) {
		
	}
	
}
