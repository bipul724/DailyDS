class Disjoint{
    int parent[];
    int size[];

    public Disjoint(int n){
        parent = new int[n];
        size = new int[n];

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
    public int makeConnected(int n, int[][] connections) {
        Disjoint ds = new Disjoint(n);
        int countExtra = 0;

        for(int i=0;i<connections.length;i++){
            int u = connections[i][0];
            int v = connections[i][1];

            if(ds.findPair(u)==ds.findPair(v)){
                countExtra++;
            }
            else{
                ds.unionBySize(u,v);
            }
        }


        int component = 0;
        for(int i=0;i<n;i++){
            if(ds.findPair(i)==i){
                component++;
            }
        }
        int ans = component - 1;
        System.out.println(ans);
        System.out.println(countExtra);
        if(ans<=countExtra){
            return ans;
        }
        return -1;
    }
}