class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int n = heights.length;

        for(int i=0;i<n-1;i++){
            int diff = heights[i+1]-heights[i];
            if(diff<=0){
                continue;
            }
            if(bricks>=diff){
                bricks-=diff;
                pq.add(diff);
            }
            else if(ladders>0){
                int x = 0;
                
                if(!pq.isEmpty() && pq.peek()>=diff){
                    x = pq.poll();
                    pq.add(diff);
                    bricks += x - diff;
                }
                ladders--;
            }
            else{
                return i;
            }
        }
        return n-1;
    }
}