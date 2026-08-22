class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = (int)n/2;
//transpose
        for(int j= 0; j<n; j++){
            for(int i = n - 1; i >=0; i--){
                if(i>=j){
                     int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                }
               
            }
        }
        //reverse each row
        for(int j= 0; j<n; j++){
            for(int i = 0; i<m; i++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}