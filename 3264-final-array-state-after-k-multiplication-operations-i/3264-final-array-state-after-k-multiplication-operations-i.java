class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->{
            int valueComparison = Integer.compare(a[0],b[0]);
            if(valueComparison==0){
                return Integer.compare(a[1],b[1]);

            }
            return valueComparison;
        });
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        while(k>0){
            int []x = pq.poll();
            int db = x[0]*multiplier;
            nums[x[1]]=db;
            pq.add(new int[]{db,x[1]});
            k--;
        }

        
        return nums;
    }
}