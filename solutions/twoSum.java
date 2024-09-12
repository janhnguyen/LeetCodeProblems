/*class Solution {
    public int[] twoSum(int[] nums, int target) {

        //base case
        if (nums.length == 2) {
            return new int[]{0,1};
        }

        //n(n-1) runtime
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return null;

    }
}*/