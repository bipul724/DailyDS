class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minL = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < n) {

            sum += nums[j];

            while (sum >= target) {

                minL = Math.min(minL, (j - i + 1));

                sum -= nums[i];
                i++;
            }

            j++;
        }

        if (minL == Integer.MAX_VALUE) {
            return 0;
        }

        return minL;
    }
}