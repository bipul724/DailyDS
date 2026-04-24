class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        int prefix = 1;

        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix++;
            }
            if(suffix==0){
                suffix++;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];
            
            ans = Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}