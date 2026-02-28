class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int count = 0;
        int maxLen = 0;
        boolean flag = false;

        while(j<n){
            if(nums[j]==0){
                count++;
                flag = true;
            }

            while(count>1){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            maxLen = Math.max(maxLen,(j-i+1));
            j++;
        }
        
        return maxLen-1;
    }
}