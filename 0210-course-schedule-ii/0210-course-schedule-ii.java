class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        
        
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            
            adj.get(v).add(u);
            
            
        }
        
        int []indegree = new int[V];
        
        for(int i=0;i<V;i++){
            for(int y:adj.get(i)){
                indegree[y]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        
        int[] ans = new int[V];
        int i = 0;
        
        while(!q.isEmpty()){
            int x = q.poll();
            ans[i++]=x;
            
            for(int y:adj.get(x)){
                indegree[y]--;
                if(indegree[y]==0){
                    q.add(y);
                }
            }
            
            
        }
        if (i != V) return new int[0];
        return ans;
    }
}