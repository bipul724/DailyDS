class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        long []sum = new long[n];
        int minLen = Integer.MAX_VALUE;

        while(j<n){
            if(j==0){
                sum[j]=nums[j];
            }
            else{
                sum[j]=sum[j-1]+nums[j];
            }
            if(sum[j]>=k){
                minLen = Math.min(minLen,j+1);
            }
            while(!dq.isEmpty() && sum[j]-sum[dq.peekFirst()]>=k){
                minLen = Math.min(minLen,(j-dq.peekFirst()));
                dq.pollFirst();
                
            }
            while(!dq.isEmpty() && sum[j]<sum[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(j);
            j++;
        }

        if(minLen == Integer.MAX_VALUE){
            return -1;
        }
        return minLen;
    }
}