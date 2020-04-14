package my.com.leetcode;

import java.util.HashMap;


public class ContiguousArray {

	public static int findMaxLength(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max=0;
		int count=0;
		map.put(0,-1);
		
		for(int i=0;i<nums.length; i++) {
			
			if(i==0)
				count--;
			else
				count++;
			
			if(map.containsKey(count))
				max = Math.max(max, i- map.get(count));
			else
				map.put(count, i);
			
			
		}
		
		
		
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1};
		System.out.println(findMaxLength(arr));
		
		

	}

}
