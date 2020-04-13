package my.com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> result = new ArrayList<>();
		
		HashMap<String, List<String>> map = new HashMap<>();
		
		for(String s: strs) {
			
			char tempArray[] = s.toCharArray(); 
	        Arrays.sort(tempArray); 
	        String sorted = new String(tempArray);
	        if(!map.containsKey(sorted)) 
	        	
	        	map.put(sorted, new ArrayList<>());
	        	
	        	
	        
	        	
	        	map.get(sorted).add(s);
	        
	        			
		}
		
		result.addAll(map.values());
		
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(s));

	}

}
