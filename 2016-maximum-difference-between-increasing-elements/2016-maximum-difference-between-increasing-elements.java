class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int maxDiff = -1;

        for(int i=1;i<n;i++){
            int diff = nums[i]-min;

            if(nums[i]>min){
                maxDiff = Math.max(maxDiff , diff);
            }

            

            min = Math.min(nums[i],min);
        }

        return maxDiff;

    }
}