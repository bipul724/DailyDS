class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum = 0;
        int i =0;
        int j = 0;
        int n = nums.length;
        long count = 0;
        long ans = 0;



        while(j<n){
            sum+=nums[j];
            
            while((sum*(j-i+1))>=k){
               
                System.out.println("i "+i+" j "+j);

                sum-=nums[i];
                i++;
            }
           
                
                ans+=j-i+1;
                
          
           
                j++;
           
            
        }
        return ans;
    }
}