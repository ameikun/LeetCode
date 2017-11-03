package solution;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
	 char[][] map={" ".toCharArray(), "".toCharArray(),   
			 "abc".toCharArray(), "def".toCharArray(), "ghi".toCharArray(),   
			 "jkl".toCharArray(), "mno".toCharArray(), "pqrs".toCharArray(),   
			 "tuv".toCharArray(), "wxyz".toCharArray()};  
	 int length=0; 
	 
	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>(); //存放输出结果 
        length=digits.length();
        
        if(length==0)return res; 
        
        char[] tmp = new char[length];  
        char[] newdigits = digits.toCharArray();
        
        getLetterCom(res,0,newdigits,tmp);
        
        return res;
    }
		
	private void getLetterCom(List<String> res,int index,char[] digits,char[] tmp){  
        if(index>=length){  
            String letters = new String(tmp);
            //the system print is designed for testing
            //System.out.println("---"+letters);
            res.add(letters);  
            return;  //return 返回递归的上一级
        }
        int digit=digits[index]-'0';  
        for(int i=0;i<map[digit].length;i++){  
            tmp[index]=map[digit][i];
            //the system print is designed for testing
            //System.out.println(tmp[index]);
            getLetterCom(res,index+1,digits,tmp);  
        }  
	}

}
