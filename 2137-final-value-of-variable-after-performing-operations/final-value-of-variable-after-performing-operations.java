class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a = 0;
        for(int i = 0; i<operations.length; i++){
            String c = operations[i];
            if(c.charAt(1)=='-'){
                a--;
            }else{
                a++;
            }
        }
        return a;
        
    }
}