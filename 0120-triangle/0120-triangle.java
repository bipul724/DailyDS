class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        int dp[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0){
                    dp[i][j] = triangle.get(i).get(j);
                    continue;
                }
                int top = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;
                if(j>0){
                    left = dp[i-1][j-1];
                }
                if(j<i){
                    top = dp[i-1][j];
                }
                dp[i][j] = triangle.get(i).get(j) + Math.min(top,left);
                

            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min = Math.min(min,dp[n-1][j]);
        }
        return min;
    }
}