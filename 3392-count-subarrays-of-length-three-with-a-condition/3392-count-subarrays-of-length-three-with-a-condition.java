class Solution {
    public int countSubarrays(int[] nums) {
        int i = 0;
        int j = 1;
        int k = 2;
        int count = 0;

        while(k<nums.length){
           
                if((nums[j])==2*(nums[i]+nums[k])){
                    count++;
                }
            
            i++;
            j++;
            k++;
        }
        return count;
    }
}