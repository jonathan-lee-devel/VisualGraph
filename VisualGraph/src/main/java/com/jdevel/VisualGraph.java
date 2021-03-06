package com.jdevel;

import com.jdevel.display.GraphDisplay;
import com.jdevel.graph.SimpleGraph;
import com.jdevel.graph.Vertex;

import javax.swing.*;

public class VisualGraph {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

	         public void run() {
	        	 SimpleGraph graph = new SimpleGraph();
	        	 graph.addVertex(new Vertex("A"));
	        	 graph.addVertex(new Vertex("B"));
	        	 graph.addVertex(new Vertex("C"));
	        	 graph.addVertex(new Vertex("D"));
	        	 graph.addVertex(new Vertex("E"));
	        	 
	            new GraphDisplay(graph);
	         }
	      });
	}

}
