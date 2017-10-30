package map1;

import java.awt.Container;
import java.util.ArrayList;

import solution.Containerwater;
import solution.StringtoInteger;
import solution.Zigzag;

public class LeetCode22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();
		Solution solution = new Solution();
		Zigzag zigzag = new Zigzag();
		Containerwater container = new Containerwater();
		/*
		result = solution.generateParenthesis(4);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}*/
		//String string = "ABCDE";
		//System.out.println(zigzag.convert(string, 4));;
		//solution.longestPalindrome(string);
		//System.out.println(solution.longestPalindrome2(string));
		
		//LeetCode11
		int height[] = {1,2,3,4,5,6,7,8,9,10};
		//System.out.println(container.maxArea(height));
		
		//LeetCode8
		StringtoInteger stringtoInteger = new StringtoInteger();
		String str = "-123a45";
		System.out.println(stringtoInteger.myAtoi(str));

	}

}
