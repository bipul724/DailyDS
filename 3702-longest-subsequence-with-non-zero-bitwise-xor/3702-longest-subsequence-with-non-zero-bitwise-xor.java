class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int n = nums.length;
        boolean hasNonZero = false;

        for(int num : nums){
            if(num!=0){
                hasNonZero = true;
            }
            xor = xor^num;
        }

        if(xor!=0){
            return n;
        }

        return hasNonZero ? n-1 : 0;
    }
}