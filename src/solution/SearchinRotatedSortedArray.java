package solution;


public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		int len = nums.length;
		if (len==1) {
			return (target == nums[0]) ? 0:-1;
		}
		int low = 0, high = len-1;
		
		while (low <= high) {
			
			int mid = (low+high)/2;
			if (target == nums[mid]) {
				return mid;
			}
			//如果左半部分有序
			if (nums[mid] >= nums[low]) {
				if (target>=nums[low] && target<nums[mid]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
			}else {
				if (target>nums[mid] && target<=nums[high]) {
					low = mid+1;
				}else {
					high = mid-1;
				}
				
			}
			
		}
		
		return -1;
	}

}
