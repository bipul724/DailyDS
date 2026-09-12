class Solution {
    public boolean canEat(int piles[],int h,int k){
        long hours=0;
        int n = piles.length;
        for(int i=0;i<n;i++){
            hours += (piles[i]+k-1)/k;
            if(hours>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int max = Integer.MIN_VALUE;

        for(int x : piles){
            max = Math.max(max,x);
        }

        int r = max;
        int ans = max;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(canEat(piles,h,mid)){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}