class Solution {

    public static int fdivide(int[] nums, int s, int e, int target) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {

            if (mid == 0 || nums[mid - 1] != target) {
                return mid;
            }

            return fdivide(nums, s, mid - 1, target);
        }

        if (nums[mid] < target) {
            return fdivide(nums, mid + 1, e, target);
        } else {
            return fdivide(nums, s, mid - 1, target);
        }
    }

    public static int sdivide(int[] nums, int s, int e, int target) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {

            if (mid == nums.length - 1 || nums[mid + 1] != target) {
                return mid;
            }

            return sdivide(nums, mid + 1, e, target);
        }

        if (nums[mid] < target) {
            return sdivide(nums, mid + 1, e, target);
        } else {
            return sdivide(nums, s, mid - 1, target);
        }
    }

    public int[] searchRange(int[] nums, int target) {

        int[] a = new int[2];
    
        a[0] = fdivide(nums, 0, nums.length - 1, target);
        a[1] = sdivide(nums, 0, nums.length - 1, target);

        return a;
    }
}