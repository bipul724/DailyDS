class Solution {
    public long minimumReplacement(int[] nums) {
        long count  = 0;
        int  n = nums.length;

        for(int i= n-2;i>=0;i--){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            long parts = (nums[i]+nums[i+1]-1)/nums[i+1];

            
            
            count += parts-1;
            nums[i]=nums[i]/(int)parts;
        }
        return count;
    }
}