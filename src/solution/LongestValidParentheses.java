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
			
			else{
				if (temp.size() > 0) {
					temp.remove(temp.size()-1);
					if (temp.size() == 0) {
						suit = Math.max(suit, i-l+1);
					}else {
						suit = Math.max(suit, i - temp.get(temp.size()-1));
					}
				}
				/**
				 * 如果此时栈里左括号已经被消耗完了，
				 * 没有额外的左括号用来配对当前的右括号了，
				 * 那么当前的右括号就被单出来了，表明当前子串可以结束了，
				 * 此时的右括号也成为了下一个group的分界点，
				 * 此时右括号下标为index，所以下一个group的起始点为index+1,
				 * 相当于skip掉当前的右括号。  */
				else{
					l = i+1;
				}	
			}
			
		}
		
		return suit;
	}
	
	//DP
	int longestValidParentheses1(String s) {
		int len = s.length();
        if(len <= 1) return 0;
        int curMax = 0;
        //for any longest[i], it stores the longest length of valid parentheses which is end at i.
        int[] longest = new int[len];
        
        for(int i=1; i < len; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '('){
                    longest[i] = (i-2) >= 0 ? (longest[i-2] + 2) : 2;
                    curMax = Math.max(longest[i],curMax);
                }
                else{ // if s[i-1] == ')', combine the previous length.
                    if(i-longest[i-1]-1 >= 0 && s.charAt(i-longest[i-1]-1) == '('){
                        longest[i] = longest[i-1] + 2 + ((i-longest[i-1]-2 >= 0)?longest[i-longest[i-1]-2]:0);
                        curMax = Math.max(longest[i],curMax);
                    }
                }
            }
            //else if s[i] == '(', skip it, because longest[i] must be 0
        }
        return curMax;
    }

}
