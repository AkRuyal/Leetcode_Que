class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int l = 0;
        int res =0;
        for(int i=0; i<n; i++){
            String c = sentences[i];
            for(int j=0;j<c.length(); j++){
                if(c.charAt(j)==' '){
                    l++;
                }
            }
            if(res<l){
                res = l;
                
            }
            l=0;
        }
        return res+1;
    }
}