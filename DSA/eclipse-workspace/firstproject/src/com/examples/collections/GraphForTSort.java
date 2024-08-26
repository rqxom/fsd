package com.examples.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphForTSort {
	private int noOfVertices;
	private Map<Integer, Set<Integer>> map;
	int indegree[];
	public GraphForTSort(int noOfVertices) {
		this.noOfVertices=noOfVertices;
		map=new HashMap<Integer, Set<Integer>>();
		indegree=new int[noOfVertices];
	}
	public void addVertex(int vertex) {
		map.put(vertex, new HashSet<Integer>());
	}
	public void addEdge(int source,int destination) {
		Set<Integer> adjVertices=map.get(source);
		adjVertices.add(destination);
		indegree[destination-1]++;
	}
	public void topologicalSort() {
		Queue<Integer> queue=new LinkedList<Integer>();
		Set<Integer> vertices=map.keySet();
		for(int vertex:vertices) {
			if(indegree[vertex-1]==0)
				queue.offer(vertex);
		}
		while(!queue.isEmpty()) {
			int current=queue.poll();
			System.out.println(current);
			Set<Integer> adjVertices=map.get(current);
			for(int adjVertex:adjVertices) {
				indegree[adjVertex-1]--;
				if(indegree[adjVertex-1]==0)
					queue.offer(adjVertex);
			}
		}
	}
	public static void main(String[] args) {
		GraphForTSort graph=new GraphForTSort(7);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);
		graph.addVertex(7);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(3, 2);
		graph.addEdge(3, 4);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		graph.addEdge(6, 7);
		graph.addEdge(5, 7);
		System.out.println(graph.map);
		for(int i=0;i<graph.noOfVertices;i++)
			System.out.println("Vertex " + (i+1)+" " + graph.indegree[i]);
		graph.topologicalSort();
	}

}
