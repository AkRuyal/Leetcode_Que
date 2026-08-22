class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int x = 1;
        int n = nums.length;
        for(int i = 1; i<n; i++){
            if(nums[i]!=nums[j-1]){
                nums[j] = nums[i];
                j++;
                //chatgpt help with only line 11
                x = 1;
            }else{
                if(x<2){
                    nums[j] = nums[i];
                j++;
                x++;
                }else{
                    
                }
            }
        }
        return j; 
    }
}