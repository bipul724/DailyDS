class Pair{
    int row;
    int col;
    int time;
    public Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count_fresh = 0;

        Queue<Pair> q = new LinkedList<>();
        int [][]visited = new int[m][n];
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==0){
                    visited[i][j]=0;
                }
                else{
                    count_fresh++;
                }
            }
        }


        if(count_fresh==0){
            return 0;
        }
        



        int tm  = 0;
        int cnt = 0;
        int []drow = {-1,0,1,0};
        int []dcol = {0,-1,0,1};
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            q.remove();
            tm = Math.max(tm,t);
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && visited[nrow][ncol]!=2 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    visited[nrow][ncol]=2;
                    cnt++;
                }
            }

        }
        if(count_fresh!=cnt){
            return -1;
        }
        return tm;
        
    }
}