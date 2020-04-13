package my.com.leetcode;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={1,2,3,4,5,6,7,8};
		
		int target=4;
		
		int start =0;
		int end =arr.length - 1;
		
		
		while(start<=end) {
			int midpoint =start+(end-start)/2;
			
			if(arr[midpoint] <= target) {
				
				start=midpoint+1;
				
			}else {
				
				end=midpoint-1;
			}
			
			if(arr[midpoint]==target)
				System.out.println(midpoint);
			
			
		}
		
		
	}

}
