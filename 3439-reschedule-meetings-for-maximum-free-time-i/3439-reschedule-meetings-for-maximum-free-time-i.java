class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int arr[] = new int[n+1];

        arr[0] = startTime[0];

        for(int i = 1;i<n;i++){
            arr[i]=startTime[i]-endTime[i-1];
        }

        arr[n] = eventTime - endTime[n-1];
        
        int i = 0;
        int j = 0;
        int maxSum = 0;
        int currSum = 0;

        
        

        while(j<=(n)){
            currSum+=arr[j];

            while((j-i+1)>(k+1)){

                currSum-=arr[i];
                
                i++;
            }

            maxSum = Math.max(maxSum,currSum);

            j++;
        }

        return maxSum;
    }
}