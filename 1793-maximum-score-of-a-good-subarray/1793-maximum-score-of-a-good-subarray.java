class Solution {
    public int maximumScore(int[] nums, int k) {
        int i = k;
        int n = nums.length;
        int min = nums[k];
        int sum = nums[k];
        int j =k;

        while(i>0 || j<n-1){
            int x = 0;
            int y = 0;
            if(i>0){
                x = nums[i-1];
            }
            if(j<n-1){
                y=nums[j+1];
            }

            if(x>y){
                i--;
                min = Math.min(min,x);
            }
            else{
                j++;
                min = Math.min(min,y);
            }

            sum = Math.max(sum,min*(j-i+1));
        }

        return sum;
    }
}