class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans = 0;
        for(Integer i : map.keySet()){
            if(map.containsKey(i+k)){
                ans += map.get(i) * map.get(i + k);


            }
        }
        return ans;
    }
}