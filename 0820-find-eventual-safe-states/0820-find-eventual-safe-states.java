class Solution {
    public boolean dfs(int[][] graph,int []status,int []path,int []check,int i){
        status[i]=1;
        path[i]=1;

        for(int y:graph[i]){
            if(status[y]==0){
                if(dfs(graph,status,path,check,y)==true){
                    return true;
                }
            }
            else if(path[y]==1){
                
                return true;
            }
        }

        path[i]=0;
        check[i]=1;
        return false;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        ArrayList<Integer> arr = new ArrayList<>();

        int []status = new int[n];
        int []path = new int[n];
        int []check = new int[n];


        

        for(int i=0;i<n;i++){
            if(status[i]==0){
                dfs(graph,status,path,check,i);
            }
        }

        for(int i=0;i<n;i++){
            if(check[i]==1){
                arr.add(i);
            }
        }

        return arr;
    }
}