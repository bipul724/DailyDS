class Solution {
    public long getDescentPeriods(int[] prices) {
        int prev = 0;
        long count = 0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]==prices[i-1]-1){
                prev++;
            }
            else{
                prev=0;
            }
            count+=prev;
        }
        return count+n;
    }
}