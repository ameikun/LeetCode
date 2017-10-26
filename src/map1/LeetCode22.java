package map1;

import java.util.ArrayList;

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
		/*
		result = solution.generateParenthesis(4);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}*/
		String string = "ABCDE";
		System.out.println(zigzag.convert(string, 4));;
		//solution.longestPalindrome(string);
		//System.out.println(solution.longestPalindrome2(string));

	}

}
