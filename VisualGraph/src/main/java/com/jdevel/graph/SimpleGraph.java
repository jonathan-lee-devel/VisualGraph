package com.jdevel.graph;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Represents a Simple Graph.
 * A graph whereby,
 * -> it is undirected
 * -> unweighted
 * -> there are no multiple edges (more than one edge between a single pair of vertices)
 * -> there are no loops (an edge between a single vertex and itself)
 *
 */
public class SimpleGraph extends Graph {
	
	public SimpleGraph() {
		this.vertexSet = new HashSet<Vertex>();// HashSet prevents multiple instances of the same vertex
		this.edgeSet = new HashSet<Edge>();// HashSet prevents multiple instances of the same edge
		
		this.coloring = new Coloring();
	}
	
	public void debugPrintGraph() {
		Iterator<Vertex> vItr = this.vertexSet.iterator();
		Iterator<Edge> eItr = this.edgeSet.iterator();
		
		System.out.print("Vertex Set: [ ");
		while (vItr.hasNext()) {
			System.out.print(vItr.next().getName() + " ");
		}
		System.out.println("]");
		
		System.out.print("Edge Set: [ ");
		while (eItr.hasNext()) {
			Edge next = eItr.next();
			System.out.print(next.getKey().getName() + "->" + next.getValue().getName() + " ");
		}
		System.out.println("]");
	}

	@Override
	public boolean addVertex(Vertex vertex) {
		return this.vertexSet.add(vertex);
	}

	@Override
	public boolean addEdge(Edge edge) {
		// Make sure the Edge is a 2-element subset of the vertex set
		if (this.vertexSet.contains(edge.getKey()) && this.vertexSet.contains(edge.getValue()))
			if (!edge.isLoop())// Ensure that it is not a loop
				return this.edgeSet.add(edge);// Attempt to add edge
		
		return false;
	}

	@Override
	public boolean setColoring(Coloring coloring) {		
		if (this.isValidColoring(coloring)) {
			this.coloring = coloring;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isValidColoring(Coloring coloring) {
		// Iterate through the proposed Coloring
		Iterator<Entry<Vertex, Color>> itr = coloring.entrySet().iterator();
		while (itr.hasNext()) {// Invalid if any vertex in coloring is not in vertex set of graph
			if ( !this.vertexSet.contains(itr.next().getKey()) )
				return false;
		}
		
		return true;
	}

	@Override
	public boolean isProperColoring(Coloring coloring) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVertexAdjacent(Vertex vertex, Vertex adj) {
		// Iterates through the edge set of the graph, returns true if there is a match, i.e. the vertices are adjacent in the graph
		Iterator<Edge> itr = this.edgeSet.iterator();
		while (itr.hasNext()) {
			Edge next = itr.next();
			if (next.getKey().equals(vertex) && next.getValue().equals(adj))
				return true;
			if (next.getKey().equals(adj) && next.getValue().equals(vertex))
				return true;
		}
		
		return false;
	}
	
}
