package map1;

import java.util.ArrayList;
import java.util.List;

import solution.Containerwater;
import solution.KMP;
import solution.Permutations;
import solution.PhoneNumber;
import solution.StringtoInteger;
import solution.Zigzag;

public class LeetCode22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution solution = new Solution();
		
		ArrayList<String> result = new ArrayList<String>();
		result = solution.generateParenthesis(4);
		for (int i = 0; i < result.size(); i++) {
			//System.out.println(result.get(i));
		}
		
		
		Zigzag zigzag = new Zigzag();
		String string = "ABCDE";
		String con = zigzag.convert(string, 4);
		//System.out.println(con);
		solution.longestPalindrome(string);
		//System.out.println(solution.longestPalindrome2(string));
		
		
		//LeetCode11
		Containerwater container = new Containerwater();
		int height[] = {1,2,3,4,5,6,7,8,9,10};
		int maxArea = container.maxArea(height);
		//System.out.println(maxArea);
		
		//LeetCode8
		StringtoInteger stringtoInteger = new StringtoInteger();
		String str = "-123a45";
		int re = stringtoInteger.myAtoi(str);
		//System.out.println(re);
		
		
		//LeetCode17
		PhoneNumber phoneNumber = new PhoneNumber();
		List<String> com = phoneNumber.letterCombinations("234");
		//System.out.println(com);
		
		//java的indexOf字符串匹配函数的应用
		String objString = "abcdefgh";
		//System.out.println("---模式串匹配的开始位置："+objString.indexOf("cde"));
		
		//KMP算法的实现
		String tarString = "abcdefg";
		String patString = "cde";
		KMP kmp = new KMP();
		//System.out.println("回溯算的的调用："+kmp.BF(tarString, patString));
		//System.out.println(kmp.fastFind(tarString, patString));
		
		//LeetCode46 排列
		int[] nums = {1,2,3,4};
		Permutations permutations = new Permutations();
		System.out.println(permutations.permute(nums));
		System.out.println("递归方法的结果："+permutations.permute2(nums));
	}

}
