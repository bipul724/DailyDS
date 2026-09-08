class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int n = height.length;
        int water = 0;

        while(left<right){
            int h = Math.min(height[left],height[right]);
            int width = right - left;
            water = Math.max(water,width*h);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return water;
    }
}