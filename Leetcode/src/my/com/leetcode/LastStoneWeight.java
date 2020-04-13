package my.com.leetcode;

import java.util.PriorityQueue;

public class LastStoneWeight {

	
	 public static int lastStoneWeight(int[] stones) {
	        
		 PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
		 
		 for(int x: stones)
			 maxHeap.add(-x);
		 
		 while(maxHeap.size()>1) {
			 
			 int x = -maxHeap.remove();
			 int y = -maxHeap.remove();
			 
			 if(x!=y)
				 maxHeap.add(- (x-y));
			 
			 
		 }
			 
	 
	 
		 return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
		 
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,7,4,1,8,1};
		
		
		System.out.println(lastStoneWeight(a));
		

	}

}
