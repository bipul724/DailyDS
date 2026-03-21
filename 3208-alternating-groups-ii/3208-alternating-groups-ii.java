class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int i = 0;
        int j = 0;
        int n = colors.length;
        int ans = 0;
        while(j<2*n){
            if(j>0 && (Math.abs(colors[j%n]-colors[(j+1)%n])!=1)){
                i=j;
            }
            if((j-i+1)>k){
                i++;
            }
            if(((j-i+1)==k) && i<n){
                ans++;
            }
            j++;
        }
        return ans;
    }
}