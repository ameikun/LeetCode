package Dp;

public class DPcognize {
	public static void main(String[] args) {
		int[] a = {1,3,5};
		int sum = 11;
		int[] dp = new int[12];
		
	    dp[0] = 0;  
	    
	  //我们假设存在1元的硬币那么i元最多只需要i枚1元硬币，当然最好设置dp[i]等于无穷大
	    for(int i = 1; i <= sum; i++) dp[i] = i;  
	   
	    for(int i = 1; i <= sum; i++){ 
	    	// dp[i - a[j]] + 1
	        for(int j = 0; j < 3; j++){  
	            if(i >= a[j] && dp[i - a[j]] + 1 < dp[i]){  
	                dp[i] = dp[i- a[j] ] + 1;  
	            }
	            
	        }  
	    }
	    
	    
	    for (int i = 0; i < dp.length; i++) {
	    	System.out.println(dp[i]);
		}
	      
	}
}
