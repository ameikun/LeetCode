package solution;

public class Containerwater {
	
	public int maxArea(int[] height) {
		int Area = 0,h;
		int len = height.length;
		for(int i = 0;i < (len-1);i ++)
		{
			if (height[i]<height[0]) {
				continue;
			}
			for(int j = (i+1);j < len;j ++){
				h = height[i]<height[j] ? height[i]:height[j];
				Area = ((j-i)*h)>Area ? ((j-i)*h):Area;
			}
		}
       return Area; 
    }

}
