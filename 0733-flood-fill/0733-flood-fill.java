class Solution {
    void dfs_visit(int[][] image,int color,int x,int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || image[i][j]!=x || image[i][j]==color){
            return;
        }
        if(image[i][j]==x){
            image[i][j]=color;
        }
        dfs_visit(image,color,x,i,j+1,m,n);
        dfs_visit(image,color,x,i,j-1,m,n);
        dfs_visit(image,color,x,i-1,j,m,n);
        dfs_visit(image,color,x,i+1,j,m,n);
    }
    void dfs(int[][] image,int sr,int sc,int color,int x,int m,int n){
        int i = sr;
        int j = sc;
        dfs_visit(image,color,x,i,j,m,n);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int x = image[sr][sc];
        dfs(image,sr,sc,color,x,m,n);

        return image;
    }
}