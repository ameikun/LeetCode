package solution;

import java.util.ArrayList;
import java.util.List;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		int len = s.length();
		int suit = 0,l = 0;
		List<Integer> temp = new ArrayList<>();
		if (len <= 1) {
			return suit;
		}
		for (int i = 0; i < len; i++) {
			
			if (s.charAt(i) == '(') {
				temp.add(i);
			}
			
			if (s.charAt(i) == ')') {
				if (temp.size() > 0) {
					temp.remove(temp.size()-1);
					if (temp.size() == 0) {
						suit = Math.max(suit, i-l+1);
					}else {
						suit = Math.max(suit, i - temp.get(temp.size()-1));
					}
				}
				else{
					l = i+1;
				}	
			}
			
		}
		
		return suit;
	}

}
