class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int j = 0;
        int f = 0;
        int i = 0;
        int c = 0;
        //chatgpt apporach
        while (i < n - 1) {

            if (i + nums[i] > f) {
                f = i + nums[i];
            }

            if (i == c) {
                j++;
                c = f;
            }
            if (c >= n - 1) {
                break;
            }

            i++;
        }

        return j;
        // my approach
        // while(i<n){
        //     a = (n-1) - nums[i];
        //     if(a>0){
        //         while(k<nums[i]){
        //             if(nums[k]>f){
        //                 if(f<n-1){
        //                     f = nums[k];
        //                 }
                        
        //             }
        //         }
        //         i += f;
        //         j++;
        //     }else{
        //         i++;
        //         j++;
        //     }
        // }
        // return j-1;
    }
}