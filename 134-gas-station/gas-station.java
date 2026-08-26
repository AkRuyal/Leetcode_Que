class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = 0;
        //helped by gpt to think for tank
        int tank = 0;
        int res = 0;
        for(int i = 0; i<n; i++){
            sum += gas[i]-cost[i];
        }
        if(sum<0){
            return -1;
        }
        else{
            for(int i = 0; i<n; i++){
                tank += gas[i]-cost[i];
                if(tank<0){
                    res = i+1;
                    tank = 0;
                }
            }
        }
        
        return res;
    }
}