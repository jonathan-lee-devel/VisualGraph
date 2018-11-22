package com.jdevel.display;

import javax.swing.JFrame;

import com.jdevel.graph.Graph;

public class GraphDisplay extends JFrame {

	private static final long serialVersionUID = -4500717281502396136L;
	
	private GraphDisplayConfig displayConfig;
	private GraphCanvasConfig canvasConfig;
	
	private GraphCanvas canvas;
	
	private Graph graph;
	
	public GraphDisplay(Graph graph) {
		
		this.graph = graph;
		
		this.displayConfig = new GraphDisplayConfig();
		this.canvasConfig = new GraphCanvasConfig();
		
		this.canvas = new GraphCanvas(this.canvasConfig, this.graph);
		this.canvas.setPreferredSize(this.displayConfig.getDisplayDimension());
		
		this.getContentPane().add(canvas);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setTitle("VisualGraph");
		this.setVisible(true);
	}

}
