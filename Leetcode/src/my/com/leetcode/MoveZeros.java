package my.com.leetcode;

import java.util.Arrays;

public class MoveZeros {
	
	 public static void moveZeroes(int[] nums) {
		 
		 
		 int index=0;
		 
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]!=0)
				 nums[index++]=nums[i];
		 }
		 
		 for(int i=index;i<nums.length;i++) {
			 
			 nums[i]=0;
			 
		 }
		 
		 
		 
		 
		 
		 
		 System.out.println(Arrays.toString(nums));
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={0,1,0,3,12};
		moveZeroes(a);
	}

}
