package solution;

public class Containerwater {
	
	public int maxArea(int[] height) {
		/*
		int Area = 0,h;
		int len = height.length;
		for(int i = 0;i < (len-1);i ++)
		{
			if (i>0&&height[i]<height[i-1]) {
				continue;
			}
			for(int j = (i+1);j < len;j ++){
				h = height[i]<height[j] ? height[i]:height[j];
				Area = ((j-i)*h)>Area ? ((j-i)*h):Area;
			}
		}*/
		int Area = 0,h;
		int len = height.length;
		int i = 0,j = len - 1;
		while (i<j) {
			h = height[i]<height[j] ? height[i]:height[j];
			Area = ((j-i)*h)>Area ? ((j-i)*h):Area;
			if (height[i]<height[j]) {
				i++;
			} else {
				j--;
			}	
		}
       return Area; 
    }

}
