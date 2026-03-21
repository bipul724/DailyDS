class Solution {
    public long continuousSubarrays(int[] nums) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        
        int i = 0;
        int j = 0;
        int n = nums.length;
        long ans = 0;
        while (j < n) {

            while(!max.isEmpty() && nums[j]>nums[max.peekLast()]){
                max.pollLast();
            }
            max.offerLast(j);
            while(!min.isEmpty() && nums[j]<nums[min.peekLast()]){
                min.pollLast();
            }
            min.offerLast(j);

            while(Math.abs(nums[max.peekFirst()]-nums[min.peekFirst()])>2){
                if(max.peekFirst() == i){
                    max.pollFirst();
                }
                if(min.peekFirst() == i){
                    min.pollFirst();
                }
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}