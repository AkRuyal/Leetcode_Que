class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        a[0] = nums[0];
        for(int i = 1; i<n; i++){

            a[i] = a[i-1]+nums[i];
        }
        return a;
    }
}