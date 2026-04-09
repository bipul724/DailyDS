class Solution {
    public int minPatches(int[] nums, int n) {
        long maxReach = 0;
        int count = 0;
        int i = 0;
        int len = nums.length;

        while(maxReach<n){
            if(i<len && nums[i]<=maxReach+1){
                maxReach+=nums[i];
                i++;
            }
            else{
                System.out.print(maxReach+" ");
                System.out.print(maxReach+1+" ");
                maxReach+=(maxReach+1);
                System.out.println(maxReach);
                count++;
            }
        }
        return count;
    }
}