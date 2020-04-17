package my.com.leetcode;

import java.util.Stack;

public class ValidParenthesisString {
	
	
	public static boolean checkValidString(String s) {
		
		int lPara=0;
	    int star=0;
	        
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            
	            if (c == '(') {
	                lPara++;
	                star++;
	            } else if (c == '*') {
	                lPara = Math.max(0, lPara-1);
	                star++;
	            } else if (c == ')') {
	                lPara = Math.max(0, lPara-1);
	                star--;
	                if (star < 0) {
	                    return false;
	                }
	            }
	        }
	        
	        return lPara == 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="(*)";
		System.out.println(checkValidString(s));

	}

}
