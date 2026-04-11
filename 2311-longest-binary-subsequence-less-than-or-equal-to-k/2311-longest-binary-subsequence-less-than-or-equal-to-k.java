class Solution {
    public int longestSubsequence(String s, int k) {
        long x = 1;
        int count = 0;
        int n = s.length();

        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='0'){
                count++;
            }
            else if(ch=='1' && x<=k){
                count++;
                k=k-(int)x;
            }
            if(x<=k){
                x = x<<1;
            }
            
            
        }
        return count;
    }
}