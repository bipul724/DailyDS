class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int count =0;
        int sum = 1;

        if(k<=1){
            return 0;
        }


        while(j<n){
            sum *= nums[j];
            
            while(i<j && sum>=k){
                sum/=nums[i];
                i++;
            }
            
            if(sum<k){
                count+=j-i+1;
            }
            j++;
        }
        return count;
    }
}