package com.jdevel.display;

import java.awt.Dimension;

public class GraphCanvasConfig {

	private static final Dimension defaultVertexDimension;
	
	static {
		defaultVertexDimension = new Dimension(30, 30);
	}
	
	public static final Dimension getDefaultVertexDimension() {
		return GraphCanvasConfig.defaultVertexDimension;
	}
	
	private Dimension vertexDimension;

	public GraphCanvasConfig() {
		this.setVertexDimension(GraphCanvasConfig.getDefaultVertexDimension());
	}
	
	public Dimension getVertexDimension() {
		return vertexDimension;
	}

	public void setVertexDimension(Dimension vertexDimension) {
		this.vertexDimension = vertexDimension;
	}
	
	
	
}
