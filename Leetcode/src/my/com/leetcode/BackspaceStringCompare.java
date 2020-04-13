package my.com.leetcode;

import java.util.Stack;

public class BackspaceStringCompare {
	
	 public static boolean backspaceCompare(String S, String T) {
		 
		 Stack<Character> sStack = new Stack<Character>();
		 
		 for(char c: S.toCharArray()) {
			 
			 if(c!='#') {
				 sStack.push(c);
				 
			 } else if(!sStack.isEmpty()) {
				 
				 sStack.pop();
			 }
			 
		 }
		 
		 Stack<Character> tStack = new Stack<Character>();
		 for(char c: T.toCharArray()) {
			 
			 if(c!='#') {
				 tStack.push(c);
				 
			 } else if(!sStack.isEmpty()) {
				 
				 tStack.pop();
			 }
			 
		 }
		 
		 
		 while(!sStack.isEmpty()) {
			 
			 char current = sStack.pop();
			 
			 if(tStack.isEmpty() || tStack.pop() != current)
				 return false;
		 }
	    return true;
	     
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(backspaceCompare("ab#c","ad#c"));
		

	}

}
