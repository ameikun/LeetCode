package solution;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int tag = 1;
		long a = dividend;
		long b = divisor;
		if (divisor == 0) {
			return 0;
		}

		/* 避免多次计算，直接返回被除数 */
		if (divisor == 1) {
			return dividend;
		}

		if (divisor == -1) {
			/* 溢出处理-2147483648/-1 = 2147483647 而不是2147483648 */
			if (dividend <= Integer.MIN_VALUE) {
				return Integer.MAX_VALUE;
			}
			return -dividend;
		}

		/* 2.负数处理 */
		if(dividend>=0&&divisor>=0||dividend<=0&&divisor<=0){  
            tag=1;  
        }else{  
            tag=-1;  
        } 
		a = Math.abs(a);  
        b = Math.abs(b);  
		if(a<b){  
            return 0;  
        }  

		int res = 0;
		while (b <= a) {
			int cnt = 1; /* 2^n 次方 */
			long temp = b;

			/* 3.找到大于被除数的基数 */
			while (a >= temp<<1) {//while循环里面先判断temp<<1是否大于a，可防止后面溢出后的右移
				temp <<= 1;
				cnt <<= 1;
			}
			res += cnt;//当cnt=2147483648时，cnt>>1后会出错，cnt变为-1073741824
			//所以应当禁止溢出后的右移
			
			/* 4.减去基数前一个数 */
			a -= temp;
		}
		return tag*res;
	}

}
