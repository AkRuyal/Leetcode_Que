class Solution {
    public static boolean helper(int[] nums,int s, int e, int target){
        int mid = s+(e-s)/2;

        if(s>e){
            return false;
        }
        if(target==nums[mid]){
            return true;
        }
        if(nums[s] == nums[mid] && nums[mid] == nums[e]){
            return helper(nums, ++s,--e,target);
        }
        if(nums[s]<=nums[mid]){
            if(target<=nums[mid] && target>=nums[s]){
                return helper(nums, s,mid,target);
            }
            else{
                return helper(nums, mid+1,e,target);
            }
            
        }else{
            if(target>nums[mid] && target<=nums[e]){
                return helper(nums, mid+1,e,target);
            }
            else{
                return helper(nums, s,mid,target);
            }
        }
        
        
    }

    public boolean search(int[] nums, int target) {
        return helper(nums, 0,nums.length-1,target);
    }
}