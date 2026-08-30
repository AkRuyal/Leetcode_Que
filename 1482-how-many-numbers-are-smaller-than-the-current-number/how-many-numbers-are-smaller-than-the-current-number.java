class Solution {
    public int count(int[] nums, int s, int e, int t){
        int c = 0;
        int mid = s+(e-s)/2;
       if(s == e){
        if(nums[s] < t){
            return 1;
            }
            return 0;
        }
        int m = count(nums, s, mid,t);
        int n = count(nums, mid+1, e,t);
        return m+n;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            arr[i]=count(nums, 0, nums.length-1, nums[i]);
        }
        return arr;
    }
}