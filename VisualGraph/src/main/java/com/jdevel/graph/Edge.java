package com.jdevel.graph;

import org.apache.commons.lang3.tuple.MutablePair;

/**
 * Represents an edge in a graph.
 * An edge being a pair of vertices.
 * Used the javafx.util.Pair to implement, one end of the edge being the key, the other being the value.
 *
 */
public class Edge extends MutablePair<Vertex, Vertex> {

	public Edge(Vertex vertexLeft, Vertex vertexRight) {
		this.setLeft(vertexLeft);
		this.setRight(vertexRight);
	}
	
	/**
	 * Checks if the edge is a loop, i.e. if it has the same vertex on both ends
	 * @return whether or not the edge is a loop
	 */
	public boolean isLoop() {
		if (this.getLeft().equals(this.getRight()))
			return true;
		else
			return false;
	}
}
