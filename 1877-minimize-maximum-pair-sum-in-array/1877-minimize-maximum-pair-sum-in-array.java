class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int n = nums.length-1;
        for(int i=0;i<=(n/2);i++){
            if((nums[i]+nums[n-i])>max){
                max=(nums[i]+nums[n-i]);
            }
        }
        return max;

    }
}