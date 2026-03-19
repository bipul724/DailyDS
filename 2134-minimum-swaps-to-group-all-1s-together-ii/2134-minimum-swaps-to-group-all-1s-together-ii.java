class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
        }
        
        int zero = 0;
        for(int i=0;i<count;i++){
            if(nums[i]==0){
                zero++;
            }
            
        }
        int i= 0;
        int j = count;
        int ans = zero;
        int n = nums.length;
        while(j<2*nums.length){
            if(nums[j%n]==0){
                zero++;
            }
            if(j-i+1>count){
                if(nums[i%n]==0){
                    zero--;
                }
                
                i++;
            }
            ans = Math.min(zero,ans);
            j++;
        }
        return ans;
    }
}