/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    int m;
    int n;
    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if(n==0) return 0;
        m = grid[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;i<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ++count;
                }
            }

        }
    }

    void dfs(char[][] grid,int i,int j){
    if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
    grid[i][j] = '0';
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
    }
}
// @lc code=end


class Solution {
    public int numIslands(char[][] grid) {

    }
}
