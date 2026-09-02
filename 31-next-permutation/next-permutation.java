class Solution {
    //fight->left
    //Find the "pivot" 
    //Find something just larger than the pivot(after pivot index)
    //Swap them
    //Reverse everything after the pivot
    public void nextprem(int[] nums, int s , int e){
        int pivot = -1;
        int left = 0;
        int right = e;
        for(int i=e-1; i>=0; i--){
            if(nums[i]<nums[i+1])
            {
                pivot = i;
                break;
            }
        }
        if(pivot!=-1){
            for(int i=e; i>=0; i--){
            if(nums[pivot]<nums[i])
            {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        left = pivot+1;
        while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }else{
            left = pivot+1;
            right =e;
            while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        
    }
    
    public void nextPermutation(int[] nums) {
      int n = nums.length;
      int[] a = new int[n];
    nextprem(nums, 0 , nums.length-1);
    
    }
}