package solution;

public class TrappingRainWater {
	public int trap(int[] height) {
		int n = height.length;
		int volum = 0, l = 0, r = n - 1;
		
		while (l < r) {
			int minw = Math.min(height[l],height[r]);
			if (height[l] == minw)
				while (++l < r && height[l] < minw)
					volum += minw - height[l];
			else
				while (l < --r && height[r] < minw)
					volum += minw - height[r];

		}

		return volum;
	}

}
