class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1]){
                return b[1]-a[1];
            }
            return b[0]-a[0];
        });

        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            pq.offer(new int[]{ele.getKey(),ele.getValue()});
        }

        int arr[] = new int[k];

        for(int i=0;i<k;i++){
            arr[i]=pq.poll()[0];
        }

        return arr;
    }
}