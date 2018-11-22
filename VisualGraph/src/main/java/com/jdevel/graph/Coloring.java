package com.jdevel.graph;

import java.awt.Color;
import java.util.HashMap;

/**
 * Represents a coloring in a graph,
 * which is essentially an assignment of colors to none or all of the vertices of a graph.
 * Since java.util.HashMap was used to implement it, a single vertex will never be assigned multiple colors, which is ideal.
 *
 */
public class Coloring extends HashMap<Vertex, Color> {

	private static final long serialVersionUID = 257475043077526764L;
		
}
