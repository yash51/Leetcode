package my.com.leetcode;

public class MaxSubArray {
	
	public static int maxSubArray(int[] nums) {
		  int max_so_far = nums[0]; 
		    int curr_max = nums[0]; 
		  
		    for (int i = 1; i < nums.length; i++) 
		    { 
		           curr_max = Math.max(nums[i], curr_max+nums[i]); 
		        max_so_far = Math.max(max_so_far, curr_max); 
		    } 
		    return max_so_far; 
        
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(a));
		

	}

}
