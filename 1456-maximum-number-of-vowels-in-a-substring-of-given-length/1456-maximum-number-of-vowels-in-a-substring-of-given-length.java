class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;
        int maxLen = 0;

        while(j<n){
            char ch = s.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            if(j-i+1>k){
                char ch1 = s.charAt(i);
                if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                    count--;
                }
                i++;
            }
            
            ans = Math.max(ans,count);
            
            

            j++;
        }
        return ans;
    }
}