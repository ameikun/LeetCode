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
		} 
		else 
		{

			while (s.length() > 0
					&& (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
				if (isMatch(s, p.substring(2)))//这句的作用如 s= "ab"; p = ".*ab";或者时s="aaab";p="a*ab";
					return true;
				s = s.substring(1);
			}
			return isMatch(s, p.substring(2));//这句判断如 s="ab"; p="c*ab";
		}

	}

}
