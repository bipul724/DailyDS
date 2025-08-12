class Solution {
    void dfs(int [][]grid,int[][] visited,int i,int j){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || visited[i][j]==1 || grid[i][j]==0){
            return;
        }
        visited[i][j]=1;

        dfs(grid,visited,i+1,j);
        dfs(grid,visited,i-1,j);
        dfs(grid,visited,i,j+1);
        dfs(grid,visited,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][]visited = new int[m][n];
        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && visited[i][0]==0){
                dfs(grid,visited,i,0);
            }
            if(grid[i][n-1]==1 && visited[i][n-1]==0){
                dfs(grid,visited,i,n-1);
            }
        }
        for(int j=0;j<n;j++){
            if(grid[0][j]==1 && visited[0][j]==0){
                dfs(grid,visited,0,j);
            }
            if(grid[m-1][j]==1 && visited[m-1][j]==0){
                dfs(grid,visited,m-1,j);
            }
        }
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    count++;
                }
            }
        }

        return count;


    }
}