package solution;

import java.util.HashSet;

public class HappyNumber {
	public boolean isHappy(int n) {
		HashSet<Integer> res = new HashSet<>();
		while(res.add(n)) {
			System.out.println("----"+n);
			n = squareSum(n);
		}
		if (n == 1) {
			return true;
		}	
		return false; 
    }
	
	public int squareSum(int num) {
		int sum = 0,s;
		while (num != 0) {
			s = num % 10;
			num = num/10;
			sum = sum + s*s;
		}
		return sum;
	}
}
