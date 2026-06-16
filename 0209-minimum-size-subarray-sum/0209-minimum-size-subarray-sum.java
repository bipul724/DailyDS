class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int left = 0;
        int len = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            sum += nums[i];

            while(sum>=target){
                len = Math.min(len,i-left+1);
                sum-=nums[left];
                left++;
            }
        }

        if(len==Integer.MAX_VALUE){
            return 0;
        }
        return len;
    }
}