class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int i =0;
        int j =0;
        long sum = 0;
        long freq = 0;

        while(j<nums.length){
            sum += nums[j];
            while(sum+k<(nums[j]*(j-i+1L))){
                sum -= nums[i];
                i++;
            }
            freq = Math.max(freq,(j-i+1L));
            j++;
        }
        return (int)freq;
    }
}