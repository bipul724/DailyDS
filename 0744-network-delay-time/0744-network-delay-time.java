class Pair{
    int node;
    int wt;
    public Pair(int node,int wt){
        this.node = node;
        this.wt = wt;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->a.wt-b.wt);
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u = times[i][0];
            int v = times[i][1];
            int z = times[i][2];

            adj.get(u).add(new Pair(v,z));
        }
        pq.add(new Pair(k,0));
        int []dist = new int[n+1];
        int inf = (int)(1e9);
        Arrays.fill(dist,inf);
        dist[k]=0;
        dist[0]=0;

        while(!pq.isEmpty()){
            int node = pq.peek().node;
            int wt = pq.peek().wt;
            pq.remove();

            if(dist[node]<wt){
                continue;
            }

            for(Pair p : adj.get(node)){
                int adjNode = p.node;
                int edgeWeight = p.wt;

                if(dist[node]+edgeWeight<dist[adjNode]){
                    
                    dist[adjNode]=dist[node]+edgeWeight;
                    pq.add(new Pair(adjNode,dist[adjNode]));
                }
            }
        }

        int ans = 0;
        for(int i=1;i<=n;i++){
            if(dist[i]==inf){
                return -1;
            }
            ans = Math.max(ans,dist[i]);
        }
        return ans;
    }
}