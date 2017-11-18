package map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import solution.CombinationSum;
import solution.CountandSay;
import solution.GroupAnagrams;
import solution.RegularExpressionMatching;
import solution.ThreeSum;

public class LeetCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountandSay countandSay = new CountandSay();
		int n = 4;
		// System.out.println(countandSay.countAndSay(n));

		GroupAnagrams groupAnagrams = new GroupAnagrams();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// System.out.println(groupAnagrams.groupAnagrams(strs));

		Map map = new HashMap();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		// Set keySet = map.keySet();
		String[] keySet = (String[]) map.keySet().toArray(new String[0]);
		for (String key : keySet) {
			map.remove(key);
		}
		
		
		//LeetCode10
		RegularExpressionMatching regularE = new RegularExpressionMatching();
		String s = "aaab";
		String p = "a*b";
		//System.out.println(regularE.isMatch(s, p));
		
		//LeetCode15
		ThreeSum threeSum = new ThreeSum();
		int[] s1 = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum.threeSum(s1));

	}

}
