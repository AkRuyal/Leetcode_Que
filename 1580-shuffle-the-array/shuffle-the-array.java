class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] a =new int[l];
        int j = 0;
        for(int i = 0; i<n;i++){
            a[j++] = nums[i];
            a[j++] = nums[n+i];
            
        }
        return a;
    }
}