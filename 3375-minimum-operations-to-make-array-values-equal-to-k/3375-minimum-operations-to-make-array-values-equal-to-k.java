class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int min = 101;

        for(int num : nums){
            if(num<k){
                return -1;
            }
            set.add(num);
            min = Math.min(min,num);
        }

        if(min==k){
            return set.size()-1;
        }
        return set.size();
    }
}