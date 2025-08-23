class Pair{
    int row;
    int col;
    int dist;
    public Pair(int row,int col,int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int [][]dist = new int[n][m];
        int INF = (int)(1e9);
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],INF);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->a.dist-b.dist); 


        pq.add(new Pair(0,0,0));
        dist[0][0]=0;
        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,1,0,-1};

        while(!pq.isEmpty()){
            int row = pq.peek().row;
            int col = pq.peek().col;
            int dis = pq.peek().dist;
            pq.remove();

            if (row == n - 1 && col == m - 1) {
                return dis;
            }


            for(int i=0;i<4;i++){
                int newrow = row + delrow[i];
                int newcol = col + delcol[i];

                if(newrow>=0 && newcol>=0 && newrow<n && newcol<m){
                    int edgeWeight = Math.abs(heights[row][col]-heights[newrow][newcol]);
                     int newEffort=Math.max(edgeWeight,dis);
                     if(newEffort<dist[newrow][newcol]){
                        dist[newrow][newcol]=newEffort;
                        pq.add(new Pair(newrow,newcol,dist[newrow][newcol]));
                     }

                }
            }


        }
        
        return -1;
        
        
    }
}