package solution;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int k = 0,len = nums.length;
		for (int i = 0; i < len; i++) {
			if(nums[i] != val)
				nums[k++] = nums[i];
			else {
				continue;
			}
		}
		return k;  
    }

}
