class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int prev = Integer.MIN_VALUE;

        for(int num : nums){
            int min = num-k;

            if(prev<min){
                prev=min;
                count++;
            }
            else if(prev<num+k){
                prev++;
                count++;
            }
        }
        return count;
    }
}