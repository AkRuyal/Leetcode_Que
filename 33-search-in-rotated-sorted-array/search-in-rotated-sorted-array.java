class Solution {

    public static int divide(int[] nums, int s, int e, int target) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[s] <= nums[mid]) {

            if (target >= nums[s] && target < nums[mid]) {
                return divide(nums, s, mid - 1, target);
            } else {
                return divide(nums, mid + 1, e, target);
            }

        }
        else {

            if (target > nums[mid] && target <= nums[e]) {
                return divide(nums, mid + 1, e, target);
            } else {
                return divide(nums, s, mid - 1, target);
            }
        }
    }

    public int search(int[] nums, int target) {
        return divide(nums, 0, nums.length - 1, target);
    }
}