class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum = 0;
        int count = 0;
        // boolean flag = false;
        for(int i=0;i<nums.length-1;i++){
            while(nums[i+1]>nums[i]){
                count+=nums[i];
                i++;
                // flag = true;
                if(i>=nums.length-1){
                    break;
                }
            }
            
            count+=nums[i];
            
            sum =  Math.max(sum,count);
            count = 0;
            // flag=false;
            
        }
        return sum;
    }
}