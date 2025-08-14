class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int []color = new int[V];

        for(int i=0;i<V;i++){
            color[i]=-1;
        }

        
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                color[i]=0;
                
                while(!q.isEmpty()){
                    int x = q.poll();

                    for(int y : graph[x]){
                        if(color[y]==-1){
                            color[y]=1-color[x];
                            q.add(y);
                        }
                        else if(color[x]==color[y]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}