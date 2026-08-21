class Solution {
    public static int divide(int[] n, int s, int e, int t) {
        if(s>e){
            //asked chatgpt to decide what to retuen at this position
            return s;
        }
        int m = s+(e-s)/2;
        if(n[m]==t){
            return m;
        }else{
            if(s-e==0){
                if(n[m]<t){
                    return m+1;
                }
                else if(m==0){
                    return s;
                }
            }
        }
        if(n[m]>t){
        return divide(n,  s,  m-1,  t);
        }else{
            return divide(n,  m+1,  e,  t);
        }
    }
    public int searchInsert(int[] nums, int target) {
        return divide(nums, 0, nums.length - 1, target);
    }
}