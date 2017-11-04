package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 排列
 */
public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		int len = nums.length;
		List<List<Integer>> res = new ArrayList<>();
		if (len == 0||nums == null) {
			return res;
		}
		List<Integer> first = new ArrayList<>();
		
		first.add(nums[0]);
		res.add(first);
		for (int i = 1; i < len; i++) {
			int size = res.size();
			for (int j = 0; j < size; j++) {
				int size2 = res.get(0).size();
				for (int k = 0; k <= size2; k++) {
					List<Integer> temp = new ArrayList<>(res.get(0));  
                    temp.add(k, nums[i]);  
                    res.add(temp);
				}
				res.remove(0);
			}
		}
		return res;
	}

}
