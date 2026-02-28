class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minPos = -1;
        int maxPos = -1;
        int culpPos = -1;

        long ans = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxK || nums[i]<minK){
                culpPos = i;
            }
            if(nums[i]==maxK){
                maxPos = i;
            }
            if(nums[i]==minK){
                minPos = i;
            }
            long  smaller = Math.min(minPos,maxPos);

            long  temp = smaller - culpPos;
            if(temp>0){
                ans +=temp;
            }
        }
        return ans;
    }
}