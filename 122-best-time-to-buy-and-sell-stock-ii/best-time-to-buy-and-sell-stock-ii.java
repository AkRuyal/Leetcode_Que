class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = prices.length-1;
        int p = 0;
        while(l<r){
                if((prices[l+1]-prices[l])>0){
                    p+=(prices[l+1] - prices[l]);
                }
            l++;
        }
        return p;
    }
}