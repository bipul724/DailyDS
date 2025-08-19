class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = numCourses;

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(u).add(v);
        }

        Queue<Integer> q = new LinkedList<>();
        int []indegree = new int[V];

        for(int i=0;i<V;i++){
            for(int y:adj.get(i)){
                indegree[y]++;
            }
        }

        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;

        while(!q.isEmpty()){
            int x = q.poll();
            ans.add(x);
            for(int y:adj.get(x)){
                indegree[y]--;
                if(indegree[y]==0){
                    q.add(y);
                }
            }
        }

        if(ans.size()==V){
            return true;
        }
        return false;
    }
}