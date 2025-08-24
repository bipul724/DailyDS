class Pair{
    int first;
    long second;
    public Pair(int first,long second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<roads.length;i++){
            int u = roads[i][0];
            int v = roads[i][1];
            int z = roads[i][2];

            adj.get(u).add(new Pair(v,z));
            adj.get(v).add(new Pair(u,z));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->Long.compare(a.second,b.second));
        pq.add(new Pair(0,0));
        long []dist = new long[n];
        long []ways = new long[n];
        long inf = Long.MAX_VALUE;
        Arrays.fill(dist,inf);
        dist[0]=0;
        ways[0]=1;
        int mod = (int)(1e9 + 7);

        while(!pq.isEmpty()){
            int node = pq.peek().first;
            long dis = pq.peek().second;

            pq.remove();

            if(dis>dist[node]){
                continue;
            }

            for(Pair y : adj.get(node)){
                int adjNode = y.first;
                long edgeWeight =  y.second;
                long newDist = dis + edgeWeight;

                if(newDist < dist[adjNode]){
                    dist[adjNode]=newDist;
                    ways[adjNode]=ways[node];
                    pq.add(new Pair(adjNode,newDist));
                }
                else if(newDist == dist[adjNode]){
                    ways[adjNode]=((ways[adjNode]+ways[node])%mod);
                }
            }
        }

        return (int) (ways[n - 1] % mod);
    }
}