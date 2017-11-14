package map1;

import solution.CountandSay;
import solution.GroupAnagrams;

public class LeetCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountandSay countandSay = new CountandSay();
		int n = 4;
		System.out.println(countandSay.countAndSay(n));
		
		GroupAnagrams groupAnagrams = new GroupAnagrams();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams.groupAnagrams(strs));

	}

}
