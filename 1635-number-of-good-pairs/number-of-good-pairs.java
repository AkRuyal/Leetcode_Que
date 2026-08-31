class Solution {
    public int numIdenticalPairs(int[] nums) {
        //can use getOrDeafault for better timecomplexity like O(n)
        int c = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if(nums[i]== nums[j]&&i<j){
                    c++;
                }
            }
        }
        return c;
    }
}