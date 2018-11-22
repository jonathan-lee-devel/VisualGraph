package com.jdevel.display;

import javax.swing.JFrame;

public class GraphDisplay extends JFrame {

	private static final long serialVersionUID = -4500717281502396136L;
	
	private GraphDisplayConfig displayConfig;
	private GraphCanvasConfig canvasConfig;
	
	private GraphCanvas canvas;
	
	public GraphDisplay() {
		
		this.displayConfig = new GraphDisplayConfig();
		this.canvasConfig = new GraphCanvasConfig();
		
		this.canvas = new GraphCanvas(this.canvasConfig);
		this.canvas.setPreferredSize(this.displayConfig.getDisplayDimension());
		
		this.getContentPane().add(canvas);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setTitle("VisualGraph");
		this.setVisible(true);
	}

}
