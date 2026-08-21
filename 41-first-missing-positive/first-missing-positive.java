class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i<n){
            int a = nums[i]-1;
            if(nums[i] >= 1 && nums[i] <= n && nums[i] != nums[a]){
                int temp = nums[i];
                nums[i] = nums[a];
                nums[a] = temp;
               
            }else{
                 i++;
            }
        }
        while(j<n){
            if(nums[j]!= j+1){
                return j+1;
            }
            j++;
        }
        return n+1;
    }
}