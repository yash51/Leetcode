package my.com.leetcode;

import java.util.HashSet;

public class CountingElements {
	
	  public static int countElements(int[] arr) {
	      int result=0;
	      
	      HashSet<Integer> set= new HashSet<>();
	      
	      for(int x: arr)
	    	  set.add(x);
	      
	      for(int x: arr) {
	    	  if(set.contains(x+1))
	    		  result++;
	      
	      }
	        
	        
		  return result;
	  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		System.out.println(countElements(arr));
		

	}

}
