package my.com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcabcbb";
		 if(s==null || s.length()==0)
	            System.out.println("0");
	            
	            int start, end, length;
	            start=0;
	            end=0;
	            length=0;
	            
	            HashSet<Character> hashSet=  new HashSet<Character>();
	            
	            while(end<s.length()) {
	            	if(!hashSet.contains(s.charAt(end))) {
	            		hashSet.add(s.charAt(end));
	            		end++;
	            		length=Math.max(length, hashSet.size());
	            	}else {
	            		hashSet.remove(s.charAt(start));
	            		start++;
	            		
	            	}
	            		
	            	
	            	
	            	
	            }
	            
	            	
	            	
	            	
	   }
	            
}	            
	