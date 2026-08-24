class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = prices.length-1;
        int p =0;
        int ch = prices[0];
        int sch = prices[0];
        int sp = 0;
        while(l<r){
            if(ch>prices[l+1]){
                ch=prices[l+1];
            }
            if(p<prices[l+1]-ch){
                p = prices[l+1]-ch;
               
            }
            //second effective buy = price - first profit
            //second profit = price - second effective buy
            if(prices[l+1]-p<sch){
                sch=prices[l+1]-p;
            }
            if(sp<prices[l+1]-sch){
                sp = prices[l+1]-sch;
                
            }

            l++;
        }
        return sp;
    }
}