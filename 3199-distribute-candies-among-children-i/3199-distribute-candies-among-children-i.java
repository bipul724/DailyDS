class Solution {
    public int distributeCandies(int n, int limit) {
        int ans = 0;

        int MinCh1 = Math.max(0,n-(2*limit));
        int MaxCh1 = Math.min(n,limit);

        for(int i=MinCh1;i<=MaxCh1;i++){
            int N = n-i;

            int MinCh2 = Math.max(0,N-limit);
            int MaxCh2 = Math.min(N,limit);

            ans += (MaxCh2-MinCh2+1);
        }
        return ans;
    }
}