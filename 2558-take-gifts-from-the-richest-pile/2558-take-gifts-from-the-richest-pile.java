class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : gifts){
            pq.add(num);
        }

        while(k>0){
            int x = pq.poll();
            int reduced = (int)Math.sqrt(x);
            pq.add(reduced);
            k--;
        }

        long sum = 0;

        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}