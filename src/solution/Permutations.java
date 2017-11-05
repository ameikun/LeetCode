package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 排列
 */
public class Permutations {
	//非递归实现
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
				
				res.remove(0);//删除前面的元素
			}
		}
		return res;
	}
	
	
	//递归实现
	public List<List<Integer>> permute2(int[] nums) {
		List<List<Integer>> res2 = new ArrayList<>();
		dfs(res2, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return res2;
	}
	private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {  
        if(temp.size() == nums.length) {  
            res.add(new ArrayList<>(temp));  
            return;  
        }  
        for(int i = 0; i < nums.length; i++) {  
            if(!used[i]) {  
                used[i] = true;  
                temp.add(nums[i]);  
                dfs(res, temp, nums, used);  
                temp.remove(temp.size() - 1);  
                used[i] = false;  
            }  
        }  
    }  
	

}
