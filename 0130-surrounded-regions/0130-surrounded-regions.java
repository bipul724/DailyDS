class Solution {
    void dfs(char[][] board,int[][] visited,int i,int j){
        int m=board.length;
        int n=board[0].length;
        if(i<0 || i>=m || j<0 || j>=n || visited[i][j]==1 || board[i][j]=='X'){
            return;
        }
        visited[i][j]=1;
        dfs(board,visited,i+1,j);
        dfs(board,visited,i-1,j);
        dfs(board,visited,i,j+1);
        dfs(board,visited,i,j-1);
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] visited = new int[m][n];

        for(int i=0;i<m;i++){
            if(visited[i][0]==0 && board[i][0]=='O'){
                dfs(board,visited,i,0);
            }
            if(visited[i][n-1]==0 && board[i][n-1]=='O'){
                dfs(board,visited,i,n-1);
            }
        }

        for(int j=0;j<n;j++){
            if(visited[0][j]==0 && board[0][j]=='O'){
                dfs(board,visited,0,j);
            }
            if(visited[m-1][j]==0 && board[m-1][j]=='O'){
                dfs(board,visited,m-1,j);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(visited[i][j]+" ");
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        return;
    }
}