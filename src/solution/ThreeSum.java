package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		if (nums.length == 0) {
			return res;
		}
		Arrays.sort(nums);
		findComb(nums, 0, 0, temp, res);
		// 下面三句是去除res中重复的temp
		HashSet<List<Integer>> hashSet = new HashSet<>(res);
		res.clear();
		res.addAll(hashSet);

		return res;
	}

	public void findComb(int[] nums, int level, int sum, List<Integer> temp,
			List<List<Integer>> res) {
		if (temp.size() == 3) {
			if (sum == 0) {
				Collections.sort(temp);
				res.add(new ArrayList<>(temp));
				return;
			} else {
				return;
			}
		} else {
			for (int i = level; i < nums.length; i++) {
				if (temp.size() == 0 && nums[i]>0) {
					break;
				}
				temp.add(nums[i]);
				if (sum+nums[i] <= 0) {
					findComb(nums, i + 1, sum + nums[i], temp, res);
				}
				temp.remove(temp.size() - 1);
			}
		}

	}

}
