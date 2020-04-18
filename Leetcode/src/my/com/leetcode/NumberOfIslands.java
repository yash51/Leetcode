package my.com.leetcode;

public class NumberOfIslands {
	
	
	public static int numIslands(char[][] grid) {
		
		if (grid == null || grid.length == 0)
			return 0;

		int islands = 0;

		for (int i = 0; i < grid.length; i++)
			for (int j = 0; j < grid[i].length; j++)
				if (grid[i][j] == '1')
					islands += dfs(grid, i, j);

		return islands;
	}

	public static int dfs(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
			return 0;

		grid[i][j] = '0';
		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);

		return 1;
	}

	public static void main(String[] args) {
		
		 char arr[][]=  {
				 
				 "11000".toCharArray(),
				 "11000".toCharArray(),
				 "00100".toCharArray(),
				 "00011".toCharArray()
				 
		 };
		 
		
		System.out.println(numIslands(arr));
	}

}
