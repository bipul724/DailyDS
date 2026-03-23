class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int num : nums){
            map1.put(num,map1.getOrDefault(num,0)+1);

        }

        int total = map1.size();

        int i = 0;
        int j = 0;
        int n = nums.length;
        int ans = 0 ;

        while(j<n){
            map2.put(nums[j],map2.getOrDefault(nums[j],0)+1);
            while(map2.size()>=total){
                ans+=n-j;
                map2.put(nums[i],map2.getOrDefault(nums[i],0)-1);
                if(map2.get(nums[i])==0){
                    map2.remove(nums[i]);
                }
                i++;
            }
            j++;
        }
        return ans;


    }
}