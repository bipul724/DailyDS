class Solution {
    public double area(int []p1,int []p2,int []p3){
        int x1 = p1[0];
        int y1 = p1[1];
        int x2 = p2[0];
        int y2 = p2[1];
        int x3 = p3[0];
        int y3 = p3[1];
        return ((0.5)*(Math.abs((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)))));
    }
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    maxArea = Math.max(maxArea,area(points[i],points[j],points[k]));
                }
            }
        }
        return maxArea;
    }
}