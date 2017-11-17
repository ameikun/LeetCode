package solution;
/*
 * 花费了很长时间才弄懂*/
public class RegularExpressionMatching {
	public static int front = -1;

	public boolean isMatch(String s, String p) {
		if (p.length() == 0)
			return s.length() == 0;

		if (p.length() == 1)
			return (s.length() == 1)
					&& (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

		if (p.charAt(1) != '*') {
			if (s.length() == 0)
				return false;
			else
				return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
						&& isMatch(s.substring(1), p.substring(1));
		} else {

			while (s.length() > 0
					&& (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
				if (isMatch(s, p.substring(2)))
					return true;
				s = s.substring(1);
			}
			return isMatch(s, p.substring(2));
		}
		// return match(s, s.length() - 1, p, p.length() - 1);
	}

	/*
	 * public boolean match(String s, int i, String p, int j) { if (j == front)
	 * if (i == front) return true; else return false;
	 * 
	 * if (j > 0 && p.charAt(j) == '*') { if (i > front && ( p.charAt(j-1) ) ==
	 * '.' || p.charAt(j-1) == s.charAt(i) ) { if (match(s, i - 1, p, j)) return
	 * true; } else return match(s, i, p, j - 2);
	 * 
	 * }
	 * 
	 * if (p.charAt(j) == '.' || s.charAt(i) == p.charAt(j)) { return match(s, i
	 * - 1, p, j - 1); } return false; }
	 */

}
