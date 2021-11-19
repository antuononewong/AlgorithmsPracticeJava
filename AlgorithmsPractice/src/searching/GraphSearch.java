import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class GraphSearch {
	
	static int[][] graph = new int[4][4];
	
	public static void breadthFirstSearch(int start) {
		HashMap<Integer, Boolean> seen = new HashMap<>();
		Queue<Integer> next = new PriorityQueue<>();
		StringBuilder path = new StringBuilder("Breadth Path: ");
		
		next.add(start);
		
		while (seen.size() < graph.length) {
			int node = next.remove();
			
			if (!seen.containsKey(node)) {
				seen.put(node, true);
				if (seen.size() == graph.length)
					path.append(Integer.toString(node));
				else 
					path.append(Integer.toString(node) + " -> ");
				
			}
			
			for (int i = 0; i < graph.length; i++) {
				if (graph[node][i] == 1) {
					if (!seen.containsKey(i)) {
						next.add(i);
					}
				}
			}
		}
		
		System.out.println(path);
	}
	
	public static void depthFirstSearch(int start) {
		int[] seen = new int[graph.length]; // assumes vertexes are 0 through graph length
		int seenNodes = 0;
		Stack<Integer> next = new Stack<>();
		StringBuilder path = new StringBuilder("Depth Path: ");
		
		next.push(start);
		
		while (seenNodes < graph.length) {
			int node = next.pop();
			
			if (seen[node] == 0) {
				seen[node] = 1;
				seenNodes += 1;
				if (seenNodes == graph.length)
					path.append(Integer.toString(node));
				else 
					path.append(Integer.toString(node) + " -> ");
				
			}
			
			for (int i = 0; i < graph.length; i++) {
				if (graph[node][i] == 1) {
					if (seen[i] == 0) {
						next.push(i);
					}
				}
			}
		}
		
		System.out.println(path);
	}
	
	public static void main(String[] args) {
		graph[0][0] = 1;
		graph[1][0] = 1;
		graph[1][3] = 1;
		graph[2][2] = 1;
		graph[2][3] = 1;
		graph[3][1] = 1;
		graph[3][2] = 1;
		graph[3][3] = 1;
		
		breadthFirstSearch(1);
		depthFirstSearch(1);
		
		/*
		for (int i = 0; i < graph.length; i++) {
			System.out.println(Arrays.toString(graph[i]));
		}*/
	}
	
}
