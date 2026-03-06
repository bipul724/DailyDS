class Solution {
    public int[][] divideArray(int[] nums, int k) {
         Arrays.sort(nums);

         int ans[][] = new int[nums.length/3][3];
         int x = 0;

         for(int i=0;i<nums.length/3;i++){
            
                if(nums[x+2]-nums[x]<=k){

                    for(int j=0;j<3;j++){
                        ans[i][j]=nums[x];
                        x++;
                    }
                }
                else{
                    return new int[0][0];
                }
                
            
         }
         return ans;
    }
}