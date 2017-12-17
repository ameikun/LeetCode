package solution;
/**
 * 53. Maximum Subarray*/
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		if (nums.length<=0) {
			return 0;
		}
		if (nums.length==1) {
			return nums[0];
		}
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				if (max < (sum+nums[j])) {
					max = (sum+nums[j]);
				}
				sum = sum+nums[j];
			}
		}
		return max;
	}
	
	/**
	 * 动态规划*/
	public int maxSubArray2(int[] nums) {
		if (nums.length<=0) {
			return 0;
		}
		if (nums.length==1) {
			return nums[0];
		}
		int sum = nums[nums.length-1];
		int max = sum;
		for (int i = nums.length-2; i >=0 ; i--) {
			sum = Math.max(nums[i], sum+nums[i]);
			max = Math.max(max, sum);
		}
		
		return max;
	}

}
