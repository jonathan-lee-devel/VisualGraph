package com.jdevel.graph;

/**
 * Represents a vertex in a graph,
 * must have a name
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
		if (name == null || name.equals(""))
			this.name = "INVALID_VERTEX_NAME";
		this.name = name;
	}
		
}
