package my.com.leetcode;

import java.util.PriorityQueue;

public class MinCostToConnectRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 5, 10, 35, 89};
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		
		for(int i: arr)
			pQueue.offer(i);
		int result=0;
		
		
		while(pQueue.size()>1) {
			
			int t= pQueue.poll()+pQueue.poll();
			
			result+=t;
			pQueue.offer(t);
			
		}
		
		
		System.out.println(result);

	}

}
