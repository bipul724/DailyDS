class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==key){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max = 0;
        int ans = 0;
        for(Integer i : map.keySet()){
            if(max<map.get(i)){
                max=map.get(i);
                ans = i;
            }

        }
        return ans;
    }
}