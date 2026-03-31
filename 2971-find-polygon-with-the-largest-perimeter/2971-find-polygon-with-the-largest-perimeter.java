class Solution {
    public long largestPerimeter(int[] nums) {
        
        int count = 2;

        Arrays.sort(nums);
        long sum = 0;

        for(int num : nums){
            sum+=num;
        }

        int n = nums.length;
        int j = n-1;

        while(j>=2){
            if(sum-nums[j]>nums[j]){
                return sum;

            }
            else{
                sum-=nums[j];
            }
            j--;
        }

        
        return -1;
    }
}