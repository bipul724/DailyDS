class Disjoint{
    int parent[];
    int size[];

    public Disjoint(int n){
        parent = new int[n+1];
        size = new int[n+1];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }

    public int findPair(int u){
        if(parent[u]==u){
            return u;
        }
        parent[u]=findPair(parent[u]);
        return parent[u];
    }

    public void unionBySize(int u,int v){
        int ulp_u = findPair(u);
        int ulp_v = findPair(v);

        if(ulp_u==ulp_v){
            return;
        }
        if(size[ulp_u]>size[ulp_v]){
            size[ulp_u]+=size[ulp_v];
            parent[ulp_v]=ulp_u;
        }
        else{
            size[ulp_v]+=size[ulp_u];
            parent[ulp_u]=ulp_v;
        }
    }
}
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        Disjoint ds = new Disjoint(n);
        int countExtra=0;
        int x = 0;
        int y = 0;

        for(int i=0;i<n;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            if(ds.findPair(u)==ds.findPair(v)){
                countExtra++;
                x = u;
                y = v;
            }
            else{
                ds.unionBySize(u,v);
            }



        }

        int ans[] = {x,y};

        return ans;

    }
}