package solution;

import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
		int len = nums.length;
		if (len <= 1) {
			return;
		}
		int temp = -1;
		int i,j;
		for (i = len-1; i >0; i--) {
			if ((nums[i-1] >= nums[i])) {
				continue;
			}else {
				for (j = i; j < len; j++) {
					if (nums[i-1] < nums[j]) {
						continue;
					}else {
						break;
					}
				}
				temp = nums[j-1];
				nums[j-1] = nums[i-1];
				nums[i-1] = temp;
				
				//sort 
				Arrays.sort(nums, i, len);
				break;
			}
		}
		if (i == 0) {
			Arrays.sort(nums, 0, len);
			return;
		}
		

		
	}
}
