package solution;

public class SearchforaRange { 
	public int[] searchRange(int[] nums, int target) {
		int[] res = {-1,-1};
		int len = nums.length;
		
		int low = 0,high = len-1;
		int mid = 0;
		
		while (low <= high) {
			mid = (low +high)/2;
			if (target > nums[mid]) {
				low = mid + 1;	
			}else if(target < nums[mid]) {
				high = mid - 1;
			}else {
				res[0] = mid;
				res[1] = mid;
				
				int i = mid-1;
				while (i>=0 && target == nums[i]) {
					res[0] = i;
					--i;
				}
				i = mid+1;
				while (i<len && target == nums[i]) {
					res[1] = i;
					++i;
				}
				break;
			}
		}
		
		
		System.out.println(res[0]);
		System.out.println(res[1]);
		
		return res;
	}

}
