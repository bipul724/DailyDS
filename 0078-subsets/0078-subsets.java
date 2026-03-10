class Solution {
    public void solve(int[] nums,List<List<Integer>> ans,List<Integer> temp,int i){       
        if(i>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(nums,ans,temp,i+1);
        temp.remove(temp.size()-1);
        solve(nums,ans,temp,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums,ans,temp,0);
        return ans;
    }
}