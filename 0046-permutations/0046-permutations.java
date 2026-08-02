class Solution {
    public void recurPermute(int index,int []nums,List<List<Integer>> ans){
        if(index==nums.length){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            recurPermute(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    public void swap(int i,int j,int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0,nums,ans);
        return ans;
    }
}