class Solution {
    public int maxDistance(int[] colors) {
        int first = colors[0];
        int n = colors.length;
        int last = colors[n-1];
        int i = 0;
        int j = n-1;
        int maxDiff = 0;

        while(i<n){
            int diff1 = 0;
            int diff2 = 0;
            if(colors[i]!=last){
                diff1 = Math.abs(i-(n-1));
            }
            if(colors[j]!=first){
                diff2 = Math.abs(j);
            }
            maxDiff = Math.max(maxDiff,Math.max(diff1,diff2));
            i++;
            j--;
        }

        return maxDiff;
    }
}