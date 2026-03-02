class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int maxlen = 0;

        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.getOrDefault(nums[j],0)>k){
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            
            maxlen = Math.max(maxlen,(j-i+1));
            j++;
        }
        return maxlen;
    }
}