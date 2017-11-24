package solution;

import java.util.Arrays;

public class ThreeSumClosest { 
	public int threeSumClosest(int[] nums, int target) {
		int closenum=0,key;
		
		int len = nums.length;
		if (len < 3)
			return closenum;
		Arrays.sort(nums);
		key = Integer.MAX_VALUE;

		for (int i = 0; i < len; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int begin = i + 1, end = len - 1;
			while (begin < end) {
				int sum = nums[i] + nums[begin] + nums[end];
				int temp = Math.abs(sum - target);
				if (temp == 0) {
					return target;
				}
				if (temp <= key) {
					key = temp;
					closenum = sum;
				}
				
				if (sum > target)
					end--;
				else
				    begin++;
			}
		}
		return closenum;
	}

}
