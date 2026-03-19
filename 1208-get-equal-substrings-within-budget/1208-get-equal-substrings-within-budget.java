class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int maxLen = 0;
        int cost = 0;
        int sum = 0;
        while (j < n) {
            int a = s.charAt(j) - 'a';
            int b = t.charAt(j) - 'a';
            cost = Math.abs(a - b);
            sum += cost;
            while (i <= j && sum > maxCost) {
                int a1 = s.charAt(i) - 'a';
                int b2 = t.charAt(i) - 'a';
                cost = Math.abs(a1 - b2);
                sum -= cost;
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
            j++;

        }
        return maxLen;
    }
}