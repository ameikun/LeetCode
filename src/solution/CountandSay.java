package solution;

public class CountandSay {
	
	//非递归的方法
	public String countAndSay(int n) {
		String say = "1";
		if (n==1) {
			return say;
		}
		for (int i = 1; i < n; i++) {
			say = lastsay(say);
		}
		return say;   
    }
	public String lastsay(String say) {
		StringBuffer out = new StringBuffer();
		int len = say.length();
		int count = 1;
		for (int i = 0; i < len-1; i++) {
			if (say.charAt(i) == say.charAt(i+1)) {
				count++;;
			}
			else {
				out.append(count).append(say.charAt(i));
				count = 1;
			}
		}
		
		out.append(count).append(say.charAt(len-1));
		return out.toString();
	}
	
	
	//递归的方法
	public String countAndSay2(int n) {
        if(n == 1){
            return "1";
        }
        //递归调用，然后对字符串处理
        String str = countAndSay2(n-1) + "*";//为了str末尾的标记，方便循环读数
        char[] c = str.toCharArray();
        int count = 1;
        String s = "";
        for(int i = 0; i < c.length - 1;i++){
        	if(c[i] == c[i+1]){
        		count++;//计数增加
        	}else{
        		s = s + count + c[i];//上面的*标记这里方便统一处理
        		count = 1;//初始化
        	}
        }
        return s;
    }


}
