package my.com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInDictionary {
	
	
	public static String findLongestWord(String s, List<String> d) {

		String maxString = "";
		for (String str : d) {
			if (isSubsequence(s, str)) {
				if (str.length() > maxString.length() || (str.length() == maxString.length() && str.compareTo(maxString) < 0)) {

					maxString = str;
				}

			}

		}

		return maxString;

	}

	private static boolean isSubsequence(String s, String str) {
		// TODO Auto-generated method stub
		int j = 0;

		for (int i = 0; i < s.length() && j < str.length(); i++)
			if (s.charAt(i) == str.charAt(j))
				j++;

		return j == str.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<String> d = new ArrayList<String>();
			d.add("ale");
			d.add("apple");
			d.add("monkey");
			d.add("plea");
			System.out.println(findLongestWord("abpcplea",d));
	}

}
