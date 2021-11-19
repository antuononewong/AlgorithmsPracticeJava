package matrices;
/* There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 
 * 0-indexed location to perform some increment operations on the matrix.

	For each location indices[i], do both of the following:

    Increment all the cells on row ri.
    Increment all the cells on column ci.

	Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
 */

public class OddNumbersMatrix {
	
	public static int oddValuesMatrix(int[][] grid, int[][] indices) {
		
		// Step 1 - do increments
	    for (int[] rc : indices) {
	        fillMatrix(grid, rc[0], 0, "row");
	        fillMatrix(grid, 0, rc[1], "column");
	        /* Prints matrix in grid format
		    for (int i = 0; i < indices.length; i++) {
		        for (int j = 0; j < indices[0].length; j++) {
		            System.out.print(indices[i][j] + " ");
		        }
		        System.out.println();
		    }
		    */
	    }
	    
	    
	    // Step 2 - check for odds
	    int odds = 0;

	    for (int i = 0; i < grid.length; i++) {
	        for (int j = 0; j < grid[0].length; j++) {
	            if (grid[i][j] % 2 > 0)
	                odds += 1;
	        }    
	    }

	    return odds;
	}

	public static void fillMatrix(int[][] grid, int row, int column, String orientation) {
		
	    if (orientation.equals("row")) {
	        for (int i = 0; i < grid[row].length; i++) {
	            grid[row][i] += 1;
	        }
	    }

	    else if (orientation.equals("column")) {
	        for (int i = 0; i < grid.length; i++) {
	            grid[i][column] += 1;
	        }
	    }
	}
	
	public static void main(String[] args) {
		int[][] grid = new int[2][3];
		int[][] indices = new int[2][2];
		indices[0][1] = 1;
		indices[1][0] = 1;
		indices[1][1] = 2;
		
		// grid
		// 0 0 0
		// 0 0 0
		
		// indices
		// 0 1
		// 1 2
		
		System.out.println(oddValuesMatrix(grid, indices));
	}
}
