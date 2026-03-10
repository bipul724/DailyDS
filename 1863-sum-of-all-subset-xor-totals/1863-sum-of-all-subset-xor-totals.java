class Solution {
    public void solve(List<List<Integer>> ans,List<Integer> temp,int[] nums,int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(ans,temp,nums,i+1);
        temp.remove(temp.size()-1);
        solve(ans,temp,nums,i+1);
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(ans,temp,nums,0);

        int sum = 0;

        for(int i=0;i<ans.size();i++){
            int xor = 0;
            for(int j=0;j<ans.get(i).size();j++){
                xor ^= ans.get(i).get(j);
            }
            sum += xor;
        }
        return sum;
        

    }
}