package map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import solution.CombinationSum;
import solution.CombinationSumII;
import solution.CountandSay;
import solution.DivideTwoIntegers;
import solution.FourSum;
import solution.GroupAnagrams;
import solution.HappyNumber;
import solution.LongestValidParentheses;
import solution.MaximumSubarray;
import solution.NQueens;
import solution.RegularExpressionMatching;
import solution.ThreeSum;
import solution.ThreeSumClosest;
import solution.UniquePathsII;

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
		//System.out.println(threeSum.threeSum2(s1));
		
		FourSum fourSum = new FourSum();
		int[] S = {1,-2,-5,-4,-3,3,3,5};
		//System.out.println(fourSum.fourSum(S, -11));
		
		ThreeSumClosest threeSumClosest = new ThreeSumClosest();
		int[] c = {1,1,1,1};
		//System.out.println(threeSumClosest.threeSumClosest(c, -100));
		
		
		
		DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
		int a = -2147483648, b = 2;
		//System.out.println(divideTwoIntegers.divide(a, b));
		
		int cand[] = {10,1,2,7,6,1,5};
		CombinationSumII combinationSumII = new CombinationSumII();
		//System.out.println(combinationSumII.combinationSum2(cand, 8));
		
		int hNumber = 21;
		HappyNumber ha = new  HappyNumber();
		//System.out.println(ha.isHappy(hNumber));
		
		int Q = 5;
		NQueens nQueens = new NQueens();
		//System.out.println(nQueens.solveNQueens(Q));
		int[] subarray ={-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		//System.out.println(maximumSubarray.maxSubArray2(subarray));
		
		String parentheses = "())()()";
		LongestValidParentheses parentheses2 = new LongestValidParentheses();
		//System.out.println(parentheses2.longestValidParentheses(parentheses));
		
		int[][] te = {{0,0,0},
                {0,1,0},
                {0,0,0}};
		int[][] te2 = {};
		UniquePathsII  uniquePathsII = new UniquePathsII();
		System.out.println(uniquePathsII.uniquePathsWithObstacles(te));

	}

}
