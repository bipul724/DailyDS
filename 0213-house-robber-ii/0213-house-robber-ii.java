class Solution {
    public int f(int[] nums){
        int n = nums.length;

        int prev2 = 0;
        int prev = nums[0];

        for(int i=1;i<n;i++){
            int take = nums[i];
            if(i>=2){
                take+=prev2;
            }
            int notTake = prev;
            int curr = Math.max(take,notTake);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];

        for(int i=1;i<n;i++){
            arr1[i-1]=nums[i];
        }
        for(int i=0;i<n-1;i++){
            arr2[i]=nums[i];
        }
        int x = f(arr1);
        int y = f(arr2);
        return Math.max(x,y);
    }
}