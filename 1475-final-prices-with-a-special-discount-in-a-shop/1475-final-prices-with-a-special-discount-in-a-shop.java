class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int x = 0;
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    x=j;
                    break;
                }
            }
            ans[i] = prices[i]-prices[x];
            if(x==0){
                ans[i]=prices[i];
            }
        }
        return ans;
    }
}