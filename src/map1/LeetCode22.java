package map1;

import java.util.ArrayList;

public class LeetCode22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();
		Solution solution = new Solution();
		/*
		result = solution.generateParenthesis(4);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}*/
		String string = "cbb";
		//solution.longestPalindrome(string);
		System.out.println(solution.longestPalindrome(string));

	}

}
