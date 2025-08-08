class Solution {
    void dfs_visit(char[][] grid,int m,int n,int i,int j){
        
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';

        dfs_visit(grid,m,n,i+1,j);
        dfs_visit(grid,m,n,i-1,j);
        dfs_visit(grid,m,n,i,j+1);
        dfs_visit(grid,m,n,i,j-1);

    }
    int dfs(char[][] grid,int m,int n){

        
        int c = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs_visit(grid,m,n,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        return dfs(grid,m,n);
    }
}