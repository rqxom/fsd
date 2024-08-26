package com.examples.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
public class Graph {
	int noOfVertices;
	HashMap<Integer, Set<Integer>> map;
public Graph(int noOfVertices) {
	this.noOfVertices=noOfVertices;
	map=new HashMap<Integer, Set<Integer>>();
}
public void addVertex(int vertex) {//Vertex is a Key, Set Of Adjacent vertices is a value
	map.put(vertex, new HashSet<Integer>());//new HashSet is the value for the vertex
	
}
public void addEdge(int source,int destination) {
	//source is a key in the map and destination has to be added as a value in the SET
	//EDGE <1,2> 1 is a key and 2 is the value in Set
	//All adjacent vertices of source will get added into the Set
	Set<Integer> sets=map.get(source);//return Set<Integer> as the value
	sets.add(destination);
}
public void adjacentVertices(int vertex) {
	System.out.println(map.get(vertex));
}
public void DFS(int source) {
	int vertices=map.keySet().size();
	boolean visited[]=new boolean[vertices];
	Stack<Integer> stack=new Stack<Integer>();
	visited[source-1]=true;
	stack.push(source);
	while(!stack.isEmpty()) {
		source=stack.pop();
		System.out.print(source);
		Set<Integer> adj=map.get(source);
		Iterator<Integer> itr=adj.iterator();
		while(itr.hasNext()) {
			int nextVertex=itr.next();
			if(!visited[nextVertex-1])
			{
				visited[nextVertex-1]=true;
				if(!stack.contains(nextVertex))
					stack.push(nextVertex);
			}
		}
	}
	System.out.println();
}
public void BFS(int source) {
	boolean visited[]=new boolean[noOfVertices];
	Queue<Integer> queue=new LinkedList<Integer>();
	queue.offer(source);
	visited[source-1]=true;
	while(!queue.isEmpty()) {
		int v=queue.poll();
		System.out.print(v+" ");
		Set<Integer> adjVertices=map.get(v);
		for(int adjVertex:adjVertices) {
			if(!visited[adjVertex-1]) {
				if(!visited[adjVertex-1]) 
					visited[adjVertex-1]=true;
					queue.offer(adjVertex);
				}
			}
		}
	System.out.println();
	}

public void printGraph() {
	Set<Entry<Integer, Set<Integer>>> entry=  map.entrySet();
	for(Entry<Integer,Set<Integer>> e:entry) {
		System.out.println("Vertex " + e.getKey());
		Set<Integer> set=e.getValue();
		if(set.size()==0)
			System.out.println("No Edge");
		for(int v:set) {
			System.out.println("Edge " +e.getKey()+"->"+v);
		}
	}
}
public static void main(String[] args) {
	Graph g=new Graph(5);
	g.addVertex(1);
	g.addVertex(2);
	g.addVertex(3);
	g.addVertex(4);
	g.addVertex(5);
	g.addEdge(1, 2);
	g.addEdge(1, 3);
	g.addEdge(2, 1);
	g.addEdge(2, 4);
	g.addEdge(3, 1);
	g.addEdge(3, 4);
	g.addEdge(3, 5);
	g.addEdge(4, 2);
	g.addEdge(4, 3);
	g.addEdge(4, 5);
	g.addEdge(5,3);
	g.addEdge(5,4);
	g.adjacentVertices(4);
	System.out.println(g.map);
	Graph g1=new Graph(6);
	g1.addVertex(1);
	g1.addVertex(2);
	g1.addVertex(3);
	g1.addVertex(4);
	g1.addVertex(5);
	g1.addVertex(6);
	g1.addEdge(1, 2);
	g1.addEdge(1, 4);
	g1.addEdge(2, 3);
	g1.addEdge(4, 5);
	g1.addEdge(5, 2);
	g1.addEdge(5, 3);
	g1.addEdge(5, 6);
	System.out.println(g1.map);
	g1.printGraph();
	g1.DFS(1);
	g1.BFS(1);
}
}