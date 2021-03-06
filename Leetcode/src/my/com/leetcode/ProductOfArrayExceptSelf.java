package my.com.leetcode;

public class ProductOfArrayExceptSelf {
	
	public static int[] productExceptSelf(int[] nums) {
		
		int result[]= new int[nums.length];
		result[0]=1;
		int right=1;
		
		for(int i=1;i<nums.length;i++)
			result[i]=result[i-1]*nums[i-1];
			
		for(int i=nums.length-1;i>=0;i--) {
			
			result[i]= right * result[i];
			
			right= right * nums[i];
			
		}
			
		
		
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		productExceptSelf(a);
		
	}

}
