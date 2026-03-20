class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        long maxSum = Integer.MIN_VALUE;
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < n) {
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.get(nums[j]) > 1) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
                sum -= nums[i];
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;

            }
            if ((j - i + 1) == k) {
                maxSum = Math.max(maxSum, sum);
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return maxSum == Integer.MIN_VALUE ? 0 : maxSum;
    }
}