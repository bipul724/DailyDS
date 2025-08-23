class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Tuple{
    int first,second,third;
    public Tuple(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third = third;
    }

}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++){
            int u = flights[i][0];
            int v = flights[i][1];
            int z = flights[i][2];

            adj.get(u).add(new Pair(v,z));
        }

        int dist[] = new int[n];

        int inf = (int)(1e9);
        Arrays.fill(dist,inf);
        dist[src]=0;

        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(src,0,0));

        while(!q.isEmpty()){
            int node = q.peek().first;
            int cost = q.peek().second;
            int stops = q.peek().third;
            q.remove();

            if(stops>k){
                continue;
            }

            for(Pair y : adj.get(node)){
                int adjNode = y.first;
                int edgeWeight = y.second;

                if(cost+edgeWeight<dist[adjNode] && stops<=k){
                    dist[adjNode]=cost+edgeWeight;
                    q.add(new Tuple(adjNode,dist[adjNode],stops+1));
                }
            }





        }

        if(dist[dst]==inf){
            return -1;
        }
        return dist[dst];
    }
}