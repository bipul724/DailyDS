class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int n = nums.length;
        int ans [] = new int[n];

        int j = n-1;
        int index = n-1;

        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];

            if(left<right){
                ans[index--]=right;
                j--;
            }
            else{
                ans[index--]=left;
                i++;
            }

        }
        return ans;

    }
}