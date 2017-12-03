package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		if (candidates.length == 0) {
			return res;
		}
		Arrays.sort(candidates);
		
		combination(res, 0, temp, candidates, 0, target);
		
		HashSet<List<Integer>> hashSet = new HashSet<>(res);
		res.clear();
		res.addAll(hashSet);//去重
		return res;
	}

	public void combination(List<List<Integer>> res, int n,
			List<Integer> temp, int[] cand, int sum, int tar) {
		if (sum == tar) {
			res.add(new ArrayList<>(temp));
			return;
		}
		if (sum > tar) {
			return;
		}else {
			for (int i = n; i < cand.length; i++) {
				if (cand[i]>tar) {
					break;
				}
				//去重，但是例如can=[2,2,2],tar=4,无法去掉重复的
				if(i>0 && cand[i] == cand[i-1]&&temp.size()==0)
					continue;
				temp.add(cand[i]);
		    	combination(res, i+1, temp, cand, sum + cand[i], tar);
		    	temp.remove(temp.size()-1);
			}	
		}
		return ;
	}

}
