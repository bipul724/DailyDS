class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;

        int ans[] = new int[n-k+1];
        int x = 0;

        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.removeLast();
            }

            dq.addLast(i);

            if(i>=k-1){
                ans[x]=nums[dq.peekFirst()];
                x++;
            }
        }
        return ans;
    }
}