class Solution {
    public long maximumTripletValue(int[] nums) {
        long sum = 0;
        long maxDiff = 0;
        long max = 0;

        for(int i = 0;i<nums.length;i++){
            sum = Math.max(sum,maxDiff*nums[i]);
            maxDiff = Math.max(maxDiff,max-nums[i]);
            max = Math.max(max,nums[i]);
            
            

        }

        return sum;
    }
}