package solution;

public class KMP {
	private int[] next;
	public int BF(String target,String pattern) {
		int lent = target.length();
		int lenp = pattern.length();
		int i,j;
		for(i = 0;i <= lent-lenp;i ++)
		{
			for(j = 0;j < lenp;j++)
			{
				if (target.charAt(i+j) != pattern.charAt(j))
					break;
			}
			if (j == lenp) return i;
		}
		return -1;
	}
	
	//KMP算法
	public int fastFind(String target,String pattern) {
		int lent = target.length();
		int lenp = pattern.length();
		int post = 0;
		int posp = 0;	
		getNext(lenp, pattern);
		
		while (posp < lenp && post < lent) {
			if (posp == -1 || pattern.charAt(posp) == target.charAt(post)) {
				post ++; posp ++;
			}
			else posp = next[posp];	
		}
		if (posp < lenp) return -1;
		else {
			return post - lenp;
		}
	}
	
	private void getNext(int lenp,String pattern) {
		next = new int[lenp+1];
		int j = 0,k = -1;
		next[0] = -1;
		while (j<lenp) {
			if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
				j ++ ; k ++ ;
				next[j] = k;
			}
			else k = next[k];
		}
	}
}
