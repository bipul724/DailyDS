class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(nums.length==1 || k==1){
            return nums;
        }
        int ans[] = new int[nums.length-k+1];
        Arrays.fill(ans,-1);
        int n = nums.length;
        int count = 1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                count++;
            }
            else{
                count=1;
            }
            if(count>=k){
                ans[i-k+2]=nums[i+1];
            }
        }
        return ans;
    }
}