class Solution {
    public int f(int[] nums,int []dp,int n){
        if(n==0){
            return nums[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick = nums[n]+f(nums,dp,n-2);
        int notPick = f(nums,dp,n-1);

        return dp[n] = Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return f(nums,dp,n-1);
    }
}