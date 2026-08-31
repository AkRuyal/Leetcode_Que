class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        int multLeft = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = multLeft;
            multLeft *= nums[i];
        }

        int multRight = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= multRight;
            multRight *= nums[i];
        }

        return ans;
    }
}