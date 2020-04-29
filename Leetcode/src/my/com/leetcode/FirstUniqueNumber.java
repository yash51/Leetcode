package my.com.leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstUniqueNumber {
	
	  LinkedHashSet<Integer> unique = new LinkedHashSet<>();
	    HashSet<Integer> all = new HashSet<>(); 
	    
	    public void FirstUnique(int[] nums) {
	        for(int x:nums)
	            add(x);
	        
	    }
	    
	    public int showFirstUnique() {
	        if(unique.isEmpty())
	            return -1;
	        
	        return unique.iterator().next();
	        
	    }
	    
	    public void add(int value) {
	        
	        if(all.add(value))
	            unique.add(value);
	        else
	            unique.remove(value);
	            
	        
	    }

}
