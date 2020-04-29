package my.com.leetcode;

public class MaximalSquare {

	public static int maximalSquare(char[][] matrix) {
		
		  if(matrix == null || matrix.length==0)
	            return 0;
		 int result=0;
		 int m=matrix.length+1;
		 int n=matrix[0].length+1;
		 
		 int dp[][]= new int[m][n];
		 
		 for(int i=1;i<m;i++) {
			 for(int j=1;j<n;j++) {
				 
				 if(matrix[i-1][j-1]=='1')
					 dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
				 	result=Math.max(result, dp[i][j]);
				 
				 
			 }
			 
			 
		 }
		 
	     return result*result;
	 }
	
	public static void main(String args[]) {
		char arr[][]	= {
				
				"10100".toCharArray(),
				"10111".toCharArray(),
				"11111".toCharArray(),
				"10010".toCharArray()
		};	
		
		System.out.println(maximalSquare(arr));
		
	}
}
