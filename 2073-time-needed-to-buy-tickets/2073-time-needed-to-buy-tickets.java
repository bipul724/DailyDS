class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int x = tickets[k];
        int ans = 0;

        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                ans += Math.min(x,tickets[i]);
            }
            else{
                ans += Math.min(x-1,tickets[i]);
            }
            
        }
        return ans;
    }
}