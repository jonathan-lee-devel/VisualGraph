package com.jdevel.display;

public class GraphDisplayConfiguration {

	public static final int DEFAULT_DISPLAY_WIDTH = 1024, DEFAULT_DISPLAY_HEIGHT = 768;
	private int displayWidth = DEFAULT_DISPLAY_WIDTH, displayHeight = DEFAULT_DISPLAY_HEIGHT;
	
	public static final int DEFAULT_VERTEX_WIDTH = 25, DEFAULT_VERTEX_HEIGHT = 25;
	private int vertexWidth = DEFAULT_VERTEX_WIDTH, vertexHeight = DEFAULT_VERTEX_HEIGHT;
	/**
	 * @return the displayWidth
	 */
	public int getDisplayWidth() {
		return displayWidth;
	}
	/**
	 * @param displayWidth the displayWidth to set
	 */
	public void setDisplayWidth(int displayWidth) {
		this.displayWidth = displayWidth;
	}
	/**
	 * @return the displayHeight
	 */
	public int getDisplayHeight() {
		return displayHeight;
	}
	/**
	 * @param displayHeight the displayHeight to set
	 */
	public void setDisplayHeight(int displayHeight) {
		this.displayHeight = displayHeight;
	}
	/**
	 * @return the vertexWidth
	 */
	public int getVertexWidth() {
		return vertexWidth;
	}
	/**
	 * @param vertexWidth the vertexWidth to set
	 */
	public void setVertexWidth(int vertexWidth) {
		this.vertexWidth = vertexWidth;
	}
	/**
	 * @return the vertexHeight
	 */
	public int getVertexHeight() {
		return vertexHeight;
	}
	/**
	 * @param vertexHeight the vertexHeight to set
	 */
	public void setVertexHeight(int vertexHeight) {
		this.vertexHeight = vertexHeight;
	}
	
}
