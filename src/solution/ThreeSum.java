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
				if (temp.size() == 0 && nums[i] > 0)
					break;
				temp.add(nums[i]);
				if (sum + nums[i] <= 0) {
					findComb(nums, i + 1, sum + nums[i], temp, res);
				}
				temp.remove(temp.size() - 1);
			}
		}

	}

	// 下面是不超时的算法，时间复杂度为O(n*n)
	public List<List<Integer>> threeSum2(int[] nums) {
		List<List<Integer>> sulList = new ArrayList<>();
		int len = nums.length;
		if (len < 3)
			return sulList;
		Arrays.sort(nums);

		for (int i = 0; i < len; i++) {
			if (nums[i] > 0)
				break;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int begin = i + 1, end = len - 1;
			while (begin < end) {
				int sum = nums[i] + nums[begin] + nums[end];
				if (sum == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[begin]);
					list.add(nums[end]);
					sulList.add(list);
					begin++;
					end--;
					
					//the next two while to skip the same number
					while (begin < end && nums[begin] == nums[begin - 1])
						begin++;
					while (begin < end && nums[end] == nums[end + 1])
						end--;
				} else if (sum > 0)
					end--;
				else
					begin++;
			}
		}
		return sulList;
	}

}
