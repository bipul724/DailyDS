class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count = 0;

        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            int x = ele.getValue();
            if(x<2){
                return -1;
            }

            count+=(x+2)/3;
        }

        return count;
    }
}