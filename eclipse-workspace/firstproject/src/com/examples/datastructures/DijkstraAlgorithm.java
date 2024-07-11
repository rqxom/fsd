package com.examples.datastructures;
import java.util.Arrays;
public class DijkstraAlgorithm {
   public static void findMinimumDistance(int cost[][],int source) {
	   int dist[]=new int[cost.length];//for each vertex, the distance from the source to the vertex will be stored in the array
	   boolean visited[]=new boolean[cost.length];
	   Arrays.fill(dist, Integer.MAX_VALUE);
	   dist[source]=0;
	   for(int i=0;i<cost.length-1;i++) {
		   int u=minDistanceVertex(dist, visited);
		   visited[u]=true;  //u=0, v=0,1,2,3,4,5     u=1,v=0,1,2,3,4,5     u=2,v=0,1,2,3,4,5                  //0 +1 <Integer.MAX_VALUE
		   for(int v=0;v<cost.length;v++) {									//dist[0]+cost[0][1] <dist[1]
			   if(!visited[v] && cost[u][v]!=0 &&dist[u]!=Integer.MAX_VALUE && dist[u]+cost[u][v]<dist[v]) {
				   dist[v]=dist[u]+cost[u][v];  //update dist array,  dist[1]=1
			   }
		   }
	   }
	   for(int i=0;i<cost.length;i++) { 
		   System.out.println(source + "->" + i + "\t" + dist[i]);//final optimal solution
	   }
   }
	
	//Method to find minimum distance vertex (u)
	public static int minDistanceVertex(int dist[],boolean visited[]) {
		int min=Integer.MAX_VALUE;
		int minVertexIndex=-1;
		for(int i=0;i<dist.length;i++) {
			//if the vertex is not yet visited and if its distance is minimum then selected that vertex as u
			if(!visited[i] && dist[i]<=min) {
				min=dist[i];
				minVertexIndex=i;
			}
		}
		return minVertexIndex;
	}
	public static void main(String[] args) {
		int cost[][]= {{0,1,0,20,0,0},
					   {0,0,5,5,9,7},
					   {0,0,0,0,0,2},
					   {0,0,0,0,3,0},
					   {0,0,0,0,0,8},
					   {0,0,0,0,0,0}
		              };//REPRESENTING WEIGHTED GRAPH USING MATRIX - 2Dimensional array
		findMinimumDistance(cost,0);
		
		int cost1[][]= {{0,50,45,10,0,0},
				   {0,0,10,15,20,0},
				   {0,0,0,0,30,0},
				   {2,0,0,0,15,0},
				   {0,20,35,0,0,0},
				   {0,0,0,0,3,0}
	              };//REPRESENTING WEIGHTED GRAPH USING MATRIX - 2Dimensional array
	findMinimumDistance(cost1,0);
	}
}