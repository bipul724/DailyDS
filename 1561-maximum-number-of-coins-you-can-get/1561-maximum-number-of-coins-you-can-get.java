class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int l = piles.length;
        int n = l/3;
        int count = 0;

        for(int i = 0;i<n;i++){
            count+=piles[l-2];
            l=l-2;
        }

        return count;
    }
}