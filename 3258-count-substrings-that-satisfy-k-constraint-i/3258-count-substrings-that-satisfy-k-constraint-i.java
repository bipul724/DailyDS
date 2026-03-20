class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int i = 0;
        int j = 0;
        int zero = 0;
        int one = 0;
        int ans = 0;
        int n = s.length();
        while(j<n){
            if(s.charAt(j)=='0'){
                zero++;
            }
            if(s.charAt(j)=='1'){
                one++;
            }
            while(zero>k && one>k){
                if(s.charAt(i)=='0'){
                    zero--;
                }
                if(s.charAt(i)=='1'){
                    one--;
                }
                i++;

            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}