package solution;

public class Zigzag {
	public String convert(String s,int numRows) {
		StringBuilder result = new StringBuilder("");
		int tem,tem1,len = s.length();
		if(numRows < 2)
		{
			return s;
		}
		int row = len/(2*numRows-2)+1;
		//The first row
		for(int j=0;j<row;j++)
		{
			tem = 2*j*(numRows-1);
			if(tem >= len)
				break;
			result.append(s.charAt(tem));
		}
		//The middle rows
		for(int i=1;i<(numRows-1);i++)
		{
			if(i < len)
                result.append(s.charAt(i));
            else 
                break;
			for(int j=1;j<=row;j++)
			{
				tem = 2*j*(numRows-1)-i;
				if(tem >= len)
					break;
				else {
					result.append(s.charAt(tem));
				}
				
				tem1 = 2*j*(numRows-1)+i;
				if (tem1 >= len) 
					break;
				else {
					result.append(s.charAt(tem1));
				}
			}
		}
		//The last row
		for(int j=0;j<row;j++)
		{
			tem = (2*j+1)*(numRows-1);
			if(tem >= len)
				break;
			result.append(s.charAt(tem));
		}
		
		String tString = result.toString();
		return tString;
	}

}
