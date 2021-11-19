package graphs;
import java.util.HashMap;
import java.util.Map;

/*
 * There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one 
 * center node and exactly n - 1 edges that connect the center node with every other node.
 * 
 * You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes 
 * ui and vi. Return the center of the given star graph.
 */

public class CenterStarGraph {
	
	// O(edges + nodes) time O(nodes) space
	public static int findCenterStarGraph(int[][] graph) { 
	    HashMap<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
	    
	    // get count of every node that shows up per edge
	    for (int[] edge : graph) {
	        int count = occurrences.getOrDefault(edge[0], 0);
	        occurrences.put(edge[0], count + 1);

	        count = occurrences.getOrDefault(edge[1], 0);
	        occurrences.put(edge[1], count + 1);
	    }
	    
	    // iterate through map, find max count
	    int max = Integer.MIN_VALUE;
	    int node = Integer.MIN_VALUE;
	    for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
	        if (max < entry.getValue())  {
	            max = entry.getValue();
	            node = entry.getKey();
	        }
	    }

	    return node;
	}
	
	// O(1) time O(1) space
	public static int findCenterStarGraphALT(int[][] graph) {
		int firstNode = graph[0][0];
		int secondNode = graph[0][1];
		
		firstNode = (firstNode == graph[1][0] || firstNode == graph[1][1]) ? firstNode : Integer.MAX_VALUE;
		secondNode = (secondNode == graph[1][0] || secondNode == graph[1][1]) ? secondNode : Integer.MAX_VALUE;
		
		return (firstNode == Integer.MAX_VALUE) ? secondNode : firstNode;
	}
	
	public static void main(String[] args) {
		int[][] edges = new int[3][2];
		
		edges[0][0] = 1;
		edges[0][1] = 4;
		edges[1][0] = 4;
		edges[1][1] = 3;
		edges[2][0] = 4;
		edges[2][1] = 2;
		
		System.out.println(findCenterStarGraph(edges));
		System.out.println(findCenterStarGraphALT(edges));
	}


}
