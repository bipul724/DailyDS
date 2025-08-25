class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int matrix[][] = new int[n][n];
        int inf = (int)(1e9);
        for(int i=0;i<n;i++){
            Arrays.fill(matrix[i],inf);
            matrix[i][i]=0;
        }

        for(int i=0;i<edges.length;i++){
            
                matrix[edges[i][0]][edges[i][1]]=edges[i][2];
                matrix[edges[i][1]][edges[i][0]]=edges[i][2];
            
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][k]!=inf && matrix[k][j]!=inf){
                        matrix[i][j]=Math.min(matrix[i][k]+matrix[k][j],matrix[i][j]);
                    }
                }
            }
        }
        int city = -1;
        int count = 0;
        int maxCount = n+1;

        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<=distanceThreshold){
                    count++;
                }
            }
            if(maxCount>=count){
                city=i;
                maxCount=count;
            }
        }
        return city;
    }
}