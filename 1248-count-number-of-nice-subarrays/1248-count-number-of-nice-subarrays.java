class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int evenNo = 0;
        int count = 0;
        int ans = 0;

        while (j < n) {
            if (nums[j] % 2 != 0) {
                count++;
                evenNo = 0;
            }
            

            

            while (count == k) {
                evenNo++;
                if (nums[i] % 2 != 0) {
                    count--;
                }
                i++;
            }
            
            ans+=evenNo;
            
            j++;
        }
        return ans;
    }
}