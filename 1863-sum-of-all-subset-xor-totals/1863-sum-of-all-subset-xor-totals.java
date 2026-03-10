class Solution {
    public int solve(int i,int []nums,int xor){
        if(i>=nums.length){
            return xor;
        }
        int x = solve(i+1,nums,xor^nums[i]);
        int y = solve(i+1,nums,xor);
        return x+y;

    }
    public int subsetXORSum(int[] nums) {
        
        int sum = solve(0,nums,0);
        return sum;
    }
}