package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums.length < 4) {
			return res;
		}
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			for (int j = (i + 1); j < nums.length; j++) {
				if (j > 1 && nums[j - 2] == nums[j - 1]
						&& nums[j] == nums[j - 1])
					continue;
				int begin = j + 1, end = nums.length - 1;
				while (begin < end) {
					int sum = nums[i] + nums[j] + nums[begin] + nums[end];
					if (sum == target) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[begin]);
						list.add(nums[end]);
						res.add(list);
						begin++;
						end--;
						// the next two while to skip the same number
						while (begin < end && nums[begin] == nums[begin - 1])
							begin++;
						while (begin < end && nums[end] == nums[end + 1])
							end--;
					} else if (sum > target)
						end--;
					else
						begin++;
				}
			}
		}

		HashSet<List<Integer>> hashSet = new HashSet<>(res);
		res.clear();
		res.addAll(hashSet);
		return res;

	}

}
