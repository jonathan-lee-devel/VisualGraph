package com.jdevel.graph;

/**
 * Represents a vertex in a graph,
 * may or may not have a name
 */
public class Vertex {

	private String name;
	
	public Vertex(String name) {
		this.setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
		
}
