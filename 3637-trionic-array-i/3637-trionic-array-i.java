class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0;
        int q=0;

        int n = nums.length;
        int i=0;
        while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        }
        p=i;
        if(p==0 || p==n-1){
            return false;
        }

        while(i<n-1 && nums[i]>nums[i+1]){
            i++;
        }
        q=i;
        if(q==p || q==n-1){
            return false;
        }

        while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        }

        return i==n-1;


    }
}