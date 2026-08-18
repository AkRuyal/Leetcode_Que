class Solution {
    public boolean isSafe(int r, int col, char [][] b){
        for(int j=0; j<b.length; j++){
            if(b[r][j]=='Q'){
                return false;
            }
        }

        for(int i=0; i<b.length; i++){
            if(b[i][col]=='Q'){
                return false;
            }
        }

        int row = r;

        for(int c=col; c>=0 && row>=0; c--, row--){
            if(b[row][c]=='Q'){
                return false;
            }
        }

        row = r;

        for(int c=col; c<b.length && row>=0; c++, row--){
            if(b[row][c]=='Q'){
                return false;
            }
        }

        row = r;

        for(int c=col; c>=0 && row<b.length; c--, row++){
            if(b[row][c]=='Q'){
                return false;
            }
        }

        row = r;

        for(int c=col; c<b.length && row<b.length; c++, row++){
            if(b[row][c]=='Q'){
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char [][]b, List<List<String>> ab){
        String row="";
        List<String> board = new ArrayList<>();

        for(int i=0; i<b.length;i++){
            row="";

            for(int j=0; j<b[0].length; j++){
                if(b[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }

            board.add(row);
        }

        ab.add(board);
    }

    public void helper(char [][]b, List<List<String>> ab, int col){
        if(col==b.length){
            saveBoard(b,ab);
            return;
        }

        for(int i=0; i<b.length; i++){
            if(isSafe(i, col, b)){
                b[i][col]='Q';

                helper(b, ab, col+1);

                b[i][col]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allboards = new ArrayList<>();
        char [][] board = new char[n][n];

        helper(board,allboards,0);

        return allboards;
    }
}