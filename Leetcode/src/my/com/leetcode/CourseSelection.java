package my.com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class CourseSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public boolean canFinish(int numCourses, int[][] prerequisites) {
		
		int numCourses = 2;
		
		int [][]pre = {{1,0}};
		
		if(pre == null)
			throw new IllegalArgumentException("Invalid pre");
		
		if(numCourses==0 || pre.length==0)
			System.out.println("Success");
		
		//now will count number of courses  pre
			int count[]= new int[numCourses];
			
			for(int i=0;i<pre.length;i++)
				count[pre[i][0]]++;
			
		//que with zero depedency
			
		LinkedList<Integer> queue= new LinkedList<Integer>();
		
		for(int i=0;i<count.length;i++) {
			if(count[i]==0)
				queue.add(i);
		}
			
		
		//num of courses that do not have pre 
		int result = queue.size();
		
		while(!queue.isEmpty()) {
			for(int i=0;i<pre.length;i++) {
				if(pre[i][1]==queue.remove())
					count[pre[i][0]]--;
					
					if(count[pre[i][0]]==0) {
						result++;
						queue.add(count[pre[i][0]]);
					}
						
			
			
			}
		}
		
		if(result==numCourses)
			System.out.println("Success");
		
		
		
		
	}

}
