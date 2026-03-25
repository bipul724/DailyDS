class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long profit[] = new long[n];
        long totalProfit = 0;

        for (int i = 0; i < n; i++) {
            profit[i] = strategy[i] * prices[i];
            totalProfit += profit[i];
        }

        long x = 0;
        long y = 0;
        long gain = 0;
        int j = 0;
        int i = 0;

        while (j < n) {
            y += profit[j];

            if ((j - i + 1) > (k / 2)) {
                x += (prices[j]);
            }

            if ((j - i + 1) > k) {
                y -= (prices[i] * strategy[i]);
                x -= prices[i + (k / 2)];
                i++;
            }

            if ((j - i + 1) == k) {
                gain = Math.max(gain, x - y);
            }
            j++;
        }

        return totalProfit + gain;

    }
}