class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum[] = new int[nums.length];
        int n = nums.length;

        for(int i=n-2;i>=0;i--){
            rightSum[i] = rightSum[i+1]+nums[i+1];
        }

        int leftSum = 0;

        for(int i=0;i<n;i++){
            rightSum[i] = Math.abs(rightSum[i]-leftSum);
            leftSum += nums[i]; 
        }

        return rightSum;
    }
}