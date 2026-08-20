class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;

        int res = nums[0] + nums[1] + nums[2];
        int m = Math.abs(target - res);

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                for (int k = j + 1; k < n; k++) {

                    int x = nums[i] + nums[j] + nums[k];
                    int d = Math.abs(target - x);

                    if (m > d) {
                        m = d;
                        res = x;
                    }
                }
            }
        }

        return res;
    }
}