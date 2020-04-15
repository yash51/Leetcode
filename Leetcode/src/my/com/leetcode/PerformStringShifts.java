package my.com.leetcode;

public class PerformStringShifts {
	
	
	public static String cyclicLeftShift(String s, int k){
	    k = k%s.length();
	    return s.substring(k) + s.substring(0, k);
	}
	
	
	public static String cyclicRightShift(String s, int k){
	   
	    return  cyclicLeftShift(s,s.length()-k);
	}

	public static String stringShift(String s, int[][] shift) {
		
		for(int i=0;i< shift.length;i++) {
				
					if(shift[i][0]==0)
						s=cyclicLeftShift(s,shift[i][1]);
					else
						s=cyclicRightShift(s,shift[i][1]);
		
			}
			
		
		return s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{0,1},{1,2}};
		System.out.println(stringShift("abc",arr));
		
	
		
	}

}
