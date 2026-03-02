class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i =0;
        int j=0;
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        int count_zeros = 0;

        while(j<n){
            sum += nums[j];

            while(i<j && (nums[i]==0 || sum>goal)){
                if(nums[i]==0){
                    count_zeros++;
                }
                else{
                    count_zeros = 0;
                }
                sum -= nums[i];
                i++;
            }

            if(sum==goal){
                ans+=1+count_zeros;
            }
            j++;
        }
        return ans;
    }
}