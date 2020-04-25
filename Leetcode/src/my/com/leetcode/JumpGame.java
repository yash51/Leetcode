package my.com.leetcode;

public class JumpGame {
	
	 public static boolean canJump(int[] nums) {
		 int last=nums.length-1;
		 
		 for(int i=nums.length-1;i>=0;i--)
			 if(i+nums[i]>=last)
				 last=i;
		 
		 return last ==0;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,1,4};
		System.out.println(canJump(arr));
	}

}
