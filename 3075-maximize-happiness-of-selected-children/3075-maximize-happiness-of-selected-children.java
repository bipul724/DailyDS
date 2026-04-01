class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int time = 0;
        long sum = 0;
        for(int i=n-1;i>=0;i--){
            if(k==0){
                break;
            }
            int temp = Math.max(0,happiness[i]-time);
            sum+=temp;
            k--;
            time++;
        }
        return sum;
    }
}