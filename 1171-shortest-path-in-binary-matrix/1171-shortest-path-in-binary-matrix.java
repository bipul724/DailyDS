class Pair{
    int row ;
    int col ;
    int dist ;
    public Pair(int row,int col,int dist){
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1){
            return -1;
        }

        int [][]dist= new int[n][m];
        int INF = (int)(1e9);
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],INF);
        }
        
        dist[0][0]=0;

        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(0,0,0));

        int[] delrow = {-1,-1,-1,0,0,1,1,1};
        int[] delcol = {-1,0,1,-1,1,-1,0,1};


        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int dis = q.peek().dist;

            q.remove();

            if(dis>dist[row][col]){
                continue;
            }

            for(int i=0;i<8;i++){
                int newrow = row + delrow[i];
                int newcol = col + delcol[i];

                if(newrow>=0 && newcol>=0 && newrow<n && newcol<m && 
                grid[newrow][newcol]==0){
                    if(dist[row][col]+1<dist[newrow][newcol]){
                        dist[newrow][newcol]=dist[row][col]+1;
                        q.add(new Pair(newrow,newcol,dist[newrow][newcol]));
                    }
                }
            }
        }


        if(dist[n-1][m-1]==INF){
            return -1;
        }

        return dist[n-1][m-1]+1;

        

    }
}