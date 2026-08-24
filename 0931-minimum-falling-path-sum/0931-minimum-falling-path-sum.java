class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j] = matrix[i][j];
                    continue;
                }
                int left = Integer.MAX_VALUE;
                int top = 0;
                int right = Integer.MAX_VALUE;
                if(j>0){
                    left = dp[i-1][j-1];
                }
                if(j<m-1){
                    right = dp[i-1][j+1];
                }
                top = dp[i-1][j];
                dp[i][j] = matrix[i][j] + Math.min(top,Math.min(left,right));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<m;j++){
            min = Math.min(min,dp[n-1][j]);
        }
        return min;
    }
}