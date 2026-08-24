class Solution {
    public int maxProfit(int[] prices) {
        //only for Lowest price seen so far, Maximum profit so far
        int l = 0;
        int r = prices.length-1;
        int ch = prices[0];
        int p = 0;
        while(l<r){
            if(ch>prices[l+1]){
                ch = prices[l+1];
                l++;
            }
            else{
                if(p<prices[l+1]-ch){
                    p=(prices[l+1]-ch);
                }
                l++;
            }
        }
        return p;
    }
}