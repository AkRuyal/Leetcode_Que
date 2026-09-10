class Solution {

    public int numIslands(char[][] grid) {

        int r = grid.length;
        int c = grid[0].length;
        int co = 0;

        for(int i = 0; i < r; i++){

            for(int j = 0; j < c; j++){

                if(grid[i][j] == '1'){

                    co++;

                    dfs(grid, i, j);
                }
            }
        }

        return co;
    }

    public void dfs(char[][] grid, int r, int c){

        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length){

            return;
        }

        if(grid[r][c] == '0'){

            return;
        }

        grid[r][c] = '0';

        dfs(grid, r - 1, c); // up
        dfs(grid, r + 1, c); // down
        dfs(grid, r, c - 1); // left
        dfs(grid, r, c + 1); // right
    }
}