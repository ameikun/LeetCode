package map1;

import java.util.ArrayList;

public class Solution {
	public ArrayList<String> generateParenthesis(int n)
	{
		ArrayList<String> res = new ArrayList<String>();
		generate(n, n, "", res); 
		return res;
	}
	public void generate(int left,int right,String str,ArrayList<String> res) {
		if (left == 0 && right == 0) {
			res.add(str);
			return;
		}
		if (left > 0) {  
            generate(left - 1, right, str + '(', res);  
        }  
        if (right > left) {  
            generate(left, right - 1, str + ')', res);  
        }  
		
	}
	
	
	
	//LeetCode5
	public String longestPalindrome(String s) {
		int maxlen = 0,n,mid = 0;
		int maxlenl = 0,midl = 0;
		int len = s.length();
		if(len >= 3 && s.charAt(1) == s.charAt(2))
			midl = 1;
		for (int i = 1; i < (len - 1); i++) {
			n=i<(len-i-1)?i:(len-i-1);
			if(s.charAt(i) == s.charAt(i+1))
			{
				for (int j = 1; j <= n; j++) {
					if ((i+j+1)<len && s.charAt(i-j) == s.charAt(i+j+1)) {
						if (maxlenl < j ){
							maxlenl = j;
							midl = i;
							}
						}
					else {
						break;
					}
					}
				}
			else {
				for (int j = 1; j <= n; j++) {
					if (s.charAt(i-j) == s.charAt(i+j)) {
						if (maxlen < j ){
							maxlen = j;
							mid = i;
						}
					}
					else {
						break;
					}
				}
			}	
		}
		int l1 = maxlen*2+1;
		int l2 = maxlenl*2+2;
		if (l1 >= l2) {
			System.out.println("最长回文串为："+l1);
			return s.substring(mid-maxlen, mid+maxlen+1);
		}
		else {
			System.out.println("最长回文串为："+l2);
			System.out.println(maxlenl);
			System.out.println(midl);
			return s.substring(midl-maxlenl, midl+maxlenl+2);
		}
		
	}

}
