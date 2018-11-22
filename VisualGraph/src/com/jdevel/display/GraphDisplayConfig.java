package com.jdevel.display;

import java.awt.Dimension;

public class GraphDisplayConfig {

	private Dimension displayDimension;
	
	private static final Dimension defaultDisplayDimension;
	
	static {
		defaultDisplayDimension = new Dimension(400, 400);
	}
	
	public static Dimension getDefaultDisplayDimension() {
		return GraphDisplayConfig.defaultDisplayDimension;
	}
	
	public GraphDisplayConfig() {
		this.setDisplayDimension(GraphDisplayConfig.getDefaultDisplayDimension());
	}
	
	public Dimension getDisplayDimension() {
		return displayDimension;
	}
	public void setDisplayDimension(Dimension displayDimension) {
		this.displayDimension = displayDimension;
	}
	
}
