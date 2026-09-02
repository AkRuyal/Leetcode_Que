class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums[0];
        int m = 0;
        int x = 0;
        for(int i =0; i<nums.length; i++){
            m += nums[i];
            if(n<m){
                n = m;
            }
            if(m < 0 ){
                m = 0;
            }
        }
        return n;
    }
}