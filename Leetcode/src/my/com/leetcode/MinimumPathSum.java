package my.com.leetcode;

public class MinimumPathSum {
	
	public static int minPathSum(int[][] grid) {
		
		int dp[][] =  new int[grid.length][grid[0].length];
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				dp[i][j]+=grid[i][j];
				if(i>0 && j>0) {
					dp[i][j]+= Math.min(dp[i-1][j], dp[i][j-1]);
				}
				else if(i>0) {
					
					dp[i][j]+=dp[i-1][j];
				}
				else if(j>0) {
					dp[i][j]+=dp[i][j-1];
				}
				

			}
		}
		
		
		return dp[dp.length-1][dp[0].length-1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,3,1},
				  {1,5,1},
				  {4,2,1}};
		
		System.out.println(minPathSum(arr));
		
		

	}

}
