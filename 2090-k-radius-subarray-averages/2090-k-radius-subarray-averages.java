class Solution {
    public int[] getAverages(int[] nums, int k) {
        int []arr = new int[nums.length];
        
        int n = nums.length;
        
        Arrays.fill(arr,-1);
        if(n<2*k+1){
            return arr;
        }
        long sum = 0;
        for(int i=0;i<(2*k)+1;i++){
            sum += nums[i];
        }
        int i = 0;
        int curr = k+1;
        int j = (2*k)+1;
        arr[k] = (int)(sum / (2*k + 1));
        
        while(j<n){
            sum = sum - nums[i];
            sum = sum + nums[j];
            arr[curr] = (int)(sum / (2*k + 1));
            curr++;
            i++;
            j++;
        }

        return arr;
    }
}