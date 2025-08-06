class Solution {
    void Dfs_visit(int[][] isConnected,int status[],int i,int V){
        status[i]=1;
        for(int j=0;j<V;j++){
            if(isConnected[i][j]==1 && status[j]!=1){
                Dfs_visit(isConnected,status,j,V);
                
            }
            
        }
        
        
        
    }
    int Dfs(int[][] isConnected,int V){
        int []status = new int[V];
        int c = 0;
        for(int i=0;i<V;i++){
            if(status[i]==0){
                Dfs_visit(isConnected,status,i,V);
                c++;
            }
        }
        return c;
    }
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        int count  = 0;
        count = Dfs(isConnected,V);

        return count;
    }
}