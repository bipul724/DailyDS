class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int mask = 0;
        int maxLen = 0 ;
        while(j<n){
            while((mask & nums[j]) != 0){
                mask = mask ^ nums[i];
                i++;
            }
            mask= mask | nums[j];
            maxLen = Math.max(maxLen,(j-i+1));
            j++;
        }
        return maxLen;
    }
}