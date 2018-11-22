package com.jdevel.graph;

import java.util.Set;

/**
 * Represents a graph G = (V,E)
 * An unordered pair of two sets,
 * V -> the non-empty vertex set
 * E -> the edge set, set of unordered 2-element subsets of V
 * 
 * Can also contain a coloring, which assigns a color to none or all of the vertices in the vertex set
 *
 */
public abstract class Graph {
	
	/**
	 * Set of vertices for the graph
	 */
	protected Set<Vertex> vertexSet;
	
	/**
	 * The set of edges for the graph
	 */
	protected Set<Edge> edgeSet;
	
	/**
	 * The current coloring for the graph
	 */
	protected Coloring coloring;
	
	/**
	 * Adds a vertex to the vertex set
	 * @param vertex to be added
	 * @return success flag for adding vertex to the vertex set
	 */
	public abstract boolean addVertex(Vertex vertex);
	
	/**
	 * Adds an edge to the edge set
	 * @param edge to be added
	 * @return success flag for adding vertex to the vertex set
	 */
	public abstract boolean addEdge(Edge edge);
	
	/**
	 * Setter for the current coloring of the graph
	 * @param coloring the coloring to be set
	 * @return success flag for setting the coloring
	 */
	public abstract boolean setColoring(Coloring coloring);
	
	/**
	 * Check to ensure that the proposed coloring is a valid coloring,
	 * i.e. at most one color per vertex, and only references vertices that are elements of the vertex set for the graph
	 * @param coloring the coloring to be validated
	 * @return success flag for validating the coloring
	 */
	public abstract boolean isValidColoring(Coloring coloring);
	
	/**
	 * Check to ensure that the proposed coloring is a proper vertex coloring,
	 * i.e. every vertex is assigned a color, and no two adjacent vertices are assigned the same color
	 * @param coloring the coloring to be checked if proper
	 * @return success flag for checking that the coloring is proper
	 */
	public abstract boolean isProperColoring(Coloring coloring);

}
