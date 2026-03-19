class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        int i = 0;
        int n = nums.length;
        int maxLen = 0;
        int j = 0;
        while(j<n){
            while(!max.isEmpty() && nums[j]>max.peekLast()){
                max.pollLast();
            }
            max.addLast(nums[j]);
            while(!min.isEmpty() && nums[j]<min.peekLast()){
                min.pollLast();
            }
            min.addLast(nums[j]);
            int a = max.peekFirst();
            int b = min.peekFirst();
            System.out.println(a);
            System.out.println(b);
            while(max.peekFirst()-min.peekFirst()>limit){
                if(nums[i]==max.peekFirst()){
                    int x= max.pollFirst();
                    
                }
                if(nums[i]==min.peekFirst()){
                    int y = min.pollFirst();
                    
                }
                i++;
            }
            // System.out.println(i);
            // System.out.println(j);
            maxLen = Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}