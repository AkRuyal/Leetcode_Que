class Solution {
    public int[] plusOne(int[] nums) {
        int n = nums.length;
        int[] a = new int[n+1];
        boolean x = false;
        for (int i=n-1; i>=0; i--){
            if(nums[i]!=9){
                nums[i] +=1;
            break;
            }else if(nums[i]==9&&i==0){
                a[0] = 1;
                x = true;
            }else{
                nums[i] = 0;
            }

        }
        if(x){
            return a;
        }
        else{
            return nums;
        }
    }
}