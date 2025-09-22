class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max1 = 0;
        for(int i=0;i<nums.length;i++){
            int x = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],x);
            max1 = Math.max(x,max1);

        }
        int c = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==max1){
                c += max1;
            }
        }
        return c;
    }
}