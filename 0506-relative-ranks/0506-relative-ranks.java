class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(int i=0;i<n;i++){
            pq.offer(new int[]{score[i],i});
        }

        String ans[] = new String[n];
        int rank=1;

        while(!pq.isEmpty()){
            int []x = pq.poll();
            int idx = x[1];

            if(rank==1){
                ans[idx] = "Gold Medal";
            }
            else if(rank==2){
                ans[idx] = "Silver Medal";
            }
            else if(rank==3){
                ans[idx] = "Bronze Medal";
            }
            else{
                ans[idx] = String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}