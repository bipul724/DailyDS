class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int max = 0;
        int n = nums.length;
        int l = 0;
        for(int r=0;r<n;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            set.add(nums[r]);
            sum+=nums[r];
            max = Math.max(sum,max);
        }
        return max;
    }
}