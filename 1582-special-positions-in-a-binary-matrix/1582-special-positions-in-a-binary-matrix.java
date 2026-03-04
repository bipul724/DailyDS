class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int row[] = new int[n];
        int col[] = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    continue;
                }
                row[i]++;
                col[j]++;
                
            }
        }

        int result = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && (row[i]==1 && col[j]==1)){
                    result++;
                }
            }
        }
        return result;
    }
}