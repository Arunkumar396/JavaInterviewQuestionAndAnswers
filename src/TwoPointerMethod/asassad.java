package TwoPointerMethod;


class Solution {
	
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}


public class asassad {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int [] nums = {1,3,5,6};
		int target = 7;
		System.out.print(s.searchInsert(nums, target));
	}

}
