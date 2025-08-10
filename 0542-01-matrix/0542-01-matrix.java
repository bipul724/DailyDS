class Node{
    int row;
    int col;
    int step;
    public Node(int row,int col,int step){
        this.row = row;
        this.col = col;
        this.step = step;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] visited = new int[m][n];
        int[][] dist = new int[m][n];
        Queue<Node> q = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    visited[i][j]=1;
                    q.add(new Node(i,j,0));
                }
            }
        }

        int delrow[] = {-1,0,0,1};
        int delcol[] = {0,-1,1,0};

        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int step = q.peek().step;
            q.remove();
            dist[row][col]=step;
            for(int i=0;i<4;i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && visited[nrow][ncol]==0){
                    q.add(new Node(nrow,ncol,step+1));
                    visited[nrow][ncol]=1;
                }
            }
        }
        return dist;

    }
}