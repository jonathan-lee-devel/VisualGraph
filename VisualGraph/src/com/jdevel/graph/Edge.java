package com.jdevel.graph;

import javafx.util.Pair;

/**
 * Represents an edge in a graph.
 * An edge being a pair of vertices.
 * Used the javafx.util.Pair to implement, one end of the edge being the key, the other being the value.
 *
 */
public class Edge extends Pair<Vertex, Vertex> {
	
	private static final long serialVersionUID = 5696294831667031327L;

	public Edge(Vertex vertex1, Vertex vertex2) {
		super(vertex1, vertex2);
	}
	
	/**
	 * Checks if the edge is a loop, i.e. if it has the same vertex on both ends
	 * @return whether or not the edge is a loop
	 */
	public boolean isLoop() {
		
		if (this.getKey() != null && this.getValue() != null) {// Checks for not null
			if (this.getKey() == this.getValue()) {// Checks if the 2 ends are equal
				return true;
			}
		}
		
		return false;
	}
	
}
