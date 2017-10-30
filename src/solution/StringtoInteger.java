package solution;

public class StringtoInteger {
	private final static int INT_MAX = 2147483647;  
    private final static int INT_MIN=-2147483648;
	public int myAtoi(String str) {
		char[] chs = str.toCharArray();
		//System.out.println(chs);
		int index = 0;
		while (index < str.length() && chs[index] == ' ') {
			index ++;
		}
		int flag = 1;
		if (index < str.length() && chs[index] == '-') {
			flag = -1;
			index ++;
		}else if (index < str.length() && chs[index] == '+') {
			index ++;
		}
		int res = 0;
		while (index < str.length()) {
			if(chs[index]<'0' || chs[index]>'9'){  
                return flag*res;  
            }
			int digit = chs[index] - '0';
			if(flag == 1 && res*10.0 + digit > INT_MAX){  
                return INT_MAX;  
            }else if(flag == -1 &&-(res*10.0 + digit)<INT_MIN){  
                return INT_MIN;  
            }  
            res = res*10 + digit;  
            index ++;  
		}
        return flag*res;
    }
}
