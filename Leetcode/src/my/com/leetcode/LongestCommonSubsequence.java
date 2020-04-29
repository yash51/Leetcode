package my.com.leetcode;

public class LongestCommonSubsequence {
	
	 public static int longestCommonSubsequence(String text1, String text2) {
		 
		 int lcs[][]= new int[text1.length()+1][text2.length()+1];
		 
		 
		 for(int i=0;i<=text1.length();i++) {
			 for(int j=0;j<=text2.length();j++) {
				 if(i==0|| j==0)
					 lcs[i][j]=0;
				 else if(text1.charAt(i-1)==text2.charAt(j-1))
					 lcs[i][j]=lcs[i-1][j-1]+1;
				 else
					 lcs[i][j]= Math.max(lcs[i-1][j], lcs[i][j-1]);
				 
				 
				 
				 
			 }
		 }
	     
		 
		 int val =  lcs[text1.length()][text2.length()];
		    return text1.length() - val + text2.length() - val;
	
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcde";
		String s2="ace";
		
		
		System.out.println(longestCommonSubsequence(s1,s2));
		

	}

}
