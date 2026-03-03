class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        System.out.println(max);

        int i = 0;
        int j = 0;

        int n = nums.length;
        int count = 0;
        long ans = 0;

        while (j < n) {
            if (nums[j] == max) {
                count++;
            }
            while (count >= k) {
                if (nums[i] == max) {
                    count--;
                }
                
                i++;
            }
            ans+=i;
            j++;
        }
        return ans;

    }
}