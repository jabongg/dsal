package com.dsal.matrix;

public class LongestPathByDifferenceOne {
	// driver program 
    public static void main (String[] args)  
    { 
        int  mat[][] = { {1, 2, 9}, 
                         {5, 3, 8}, 
                         {4, 6, 7} }; 
        System.out.println("Length of the longest path is " +  
                            finLongestOverAll(mat)); 
    }

    // Function that returns length of the longest path 
    // beginning with any cell 
	private static int finLongestOverAll(int[][] mat) {

		// initialize result
		int result = 1;
		
		// lets create a lookup table, and fill the entries as -1.
		// for 3x3 matrix mxn
		int[][] dp = new int[3][3];
		 
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		
		printMatrixElements(dp);
		printMatrixElements(mat);
		
		// compute longest path possible
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if (dp[i][j] == -1) {
					findLongestPathFromAShell(mat, i, j, dp);
					
					// update the result when required
					result = Math.max(result, dp[i][j]);
				}
			}
		}
		printMatrixElements(dp);
		printMatrixElements(mat);

		return result;
	} 

	private static int findLongestPathFromAShell(int[][] mat, int i, int j, int[][] dp) {

		// check for boundary condition
		if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length) {
			return 0;
		}
		
		// if this subproblem is already solved
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		
		// since all the numbers are unique 
		// and in range of mxn
		// there is at most one possible direction from any cell
		if (i > mat.length && (mat[i][j] + 1 == mat[i - 1][j])) {
			return dp[i][j] = 1 + findLongestPathFromAShell(mat, i - 1, j, dp);
		}
		
		if (i > mat.length && (mat[i][j] + 1 == mat[i + 1][j])) {
			return dp[i][j] = 1 + findLongestPathFromAShell(mat, i + 1, j, dp);
		}
		
		if (i > mat.length && (mat[i][j] + 1 == mat[i][j - 1])) {
			return dp[i][j] = 1 + findLongestPathFromAShell(mat, i, j - 1, dp);
		}
		
		if (i > mat.length && (mat[i][j] + 1 == mat[i][j + 1])) {
			return dp[i][j] = 1 + findLongestPathFromAShell(mat, i, j + 1, dp);
		}
		
		// if none of the adjacent four elements are greater by 1
		return dp[i][j] = 1;
		
	}

	/**
	 * this method prints the elements of the matrix
	 * @param dp
	 */
	public static void printMatrixElements(int[][] dp) {
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}
}
