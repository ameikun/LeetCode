package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 当要求解的结果是一系列向量的集合时使用dfs搜索记录路径这种方法。
 * */
public class CombinationSum {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {      
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        //对一个数组的所有元素进行排序，并且按从小到大的顺序
        Arrays.sort(candidates);
        
        findSum(candidates, target, 0,0,temp, res);   
        return res;
    }
	
	public void findSum(int[] candidates, int target, int sum, int level,List<Integer> temp, List<List<Integer>> res){
        if(sum == target) {
            res.add(new ArrayList<>(temp));
            return;
        } else if(sum > target) {
            return;
        } else {
            for(int i=level;i<candidates.length;i++) {
                temp.add(candidates[i]);
                findSum(candidates, target, sum+candidates[i], i, temp, res);
                temp.remove(temp.size()-1);
            }
        }
    }

}
