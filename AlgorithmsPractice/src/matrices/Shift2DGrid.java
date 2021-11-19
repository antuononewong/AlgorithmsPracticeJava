package matrices;
/*
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid K times
Every element will go “down” a slot and the last element will be moved to the front of the matrix at 0,0.

1 2 3   9 1 2
4 5 6   3 4 5
7 8 9   6 7 8
one shift

Solution 1
Pop elements into a queue, pop them out in the same order and replace each element at m,n with
that element

O(2N) time simplified to O(N),  O(N) space

Alternative
Store current element, look at previous element, replace current element w/ previous, store current element, go on to the next m,n

O(N) time,  O(1) space

Need to do the shift k times

O(kN) time, O(1) space

possible to eliminate K passes; need to analyze more
 */
public class Shift2DGrid {
	
	public static int[][] shiftGrid(int[][] grid, int k) {
	    if (grid == null || k < 0)
	        return null;

	    for (int i = 1; i <= k; i++) {
	        shiftHelper(grid);
	    }
	    
	    return grid;
	}


	public static void shiftHelper(int[][] grid) {
	    int previous = grid[0][0];
	    int current = grid[0][0];
	    
	    for (int i = 0; i < grid.length; i++) {
	    	for (int j = 0; j < grid[0].length; j++) {
	    		current = grid[i][j];
	    		grid[i][j] = previous;
	    		previous = current;
	    	}
	    }
	    
	    grid[0][0] = current; // move last element to the front
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int square : row) {
				System.out.print(square + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] grid = new int[3][3];
		grid[0][0] = 1;
		grid[0][1] = 2;
		grid[0][2] = 3;
		grid[1][0] = 4;
		grid[1][1] = 5;
		grid[1][2] = 6;
		grid[2][0] = 7;
		grid[2][1] = 8;
		grid[2][2] = 9;
		
		shiftGrid(grid, 3);
		
		printMatrix(grid);
	}

}
