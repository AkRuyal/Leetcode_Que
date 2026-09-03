class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //apporach asked from chatgpt
        int sum = 0;
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            //to avoid duplicate triplets
            if(i>0&&nums[i]==nums[i-1])
                {
                    continue;
                }
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right)
            {
                
                sum = nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                    //asked chatgpt how to add.
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                     while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                if(sum<0)
                {
                    left++;
                }
                if(sum>0)
                {
                    right--;
                }
            }
        }
        return ls;
    }
}