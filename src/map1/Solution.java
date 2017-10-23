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
	
	
	
	//LeetCode5 边界值没处理好？？
	public String longestPalindrome(String s) {
		int maxlen = 0,n,mid = 0;
		int maxlenl = 0,midl = 0;
		int len = s.length();
		if (len == 0 || len == 1) return s;
		if(len >= 3 && s.charAt(1) == s.charAt(2))
			midl = 1;
		for (int i = 1; i < (len - 1); i++) {
			n=i<(len-i-1)?i:(len-i-1);
			if(s.charAt(i) == s.charAt(i-1))
			{
				maxlenl=1;
				for (int j = 1; j <= n; j++) {
					if ((i+j)<len && (i-j-1)>0&&s.charAt(i+j) == s.charAt(i-j-1)) {
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
		if (maxlen == 0 && mid == 0&&maxlenl==0&&midl==0) {
			return s.substring(0,1);
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
	
	//leetcod5动态规划方法
	public String longestPalindrome2(String s) {
	       if(s.length()<=1){  
	            return s;  
	        }  
	        int start=0, end=0;  
	        int maxLen = 0;  
	        boolean[][] plain = new boolean[s.length()][s.length()];  
	        for(int i=s.length()-1;i>=0;i--){  
	            for(int j=i;j<s.length();j++){  
	                if(s.charAt(i)==s.charAt(j)&&(j-i<=2||plain[i+1][j-1])){  
	                    plain[i][j]=true;  
	                    if(maxLen<j-i+1){  
	                        maxLen = j-i+1;  
	                        start = i;  
	                        end = j;  
	                    }  
	                }  
	            }  
	        }  
	        return s.substring(start, end+1);  
	    }

}
