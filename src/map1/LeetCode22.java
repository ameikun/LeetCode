package map1;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import solution.Containerwater;
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
		System.out.println(com);
	}

}
