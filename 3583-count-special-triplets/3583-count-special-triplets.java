class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> right = new HashMap<>();
        HashMap<Integer,Integer> left = new HashMap<>();
        for(int i=1;i<n;i++){
            right.put(nums[i],right.getOrDefault(nums[i],0)+1);

        } 
        long ans = 0;
        for(int i=1;i<n-1;i++){
            right.put(nums[i],right.getOrDefault(nums[i],0)-1);
            left.put(nums[i-1],left.getOrDefault(nums[i-1],0)+1);
            if(right.get(nums[i])==0){
                right.remove(nums[i]);
            }

            int target = 2*nums[i];
            if(left.containsKey(target) && right.containsKey(target)){
                ans = ans + (((long)left.get(target)*right.get(target)));
            }
        }
        return (int)(ans%1000000007);
    }
}