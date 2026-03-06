class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int k = s.length-1;

        for(int i=g.length-1;i>=0;i--){
            if(k<0){
                break;
            }
            if(s[k]>=g[i]){
                count++;
                k--;
            }
        }
        return count;
    }
}