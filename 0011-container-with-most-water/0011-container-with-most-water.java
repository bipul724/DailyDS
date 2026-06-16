class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int n = height.length;
        int j = n-1;
        int area = 0;

        while(i<j){
            int h = Math.min(height[i],height[j]);
            int curr = h*(j-i);
            area = Math.max(curr,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
}