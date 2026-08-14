class Solution {
    public int maximumLengthSubstring(String s) {
        int arr[] = new int[26];
        int n = s.length();
        int left = 0;
        int len = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
            while(arr[ch-'a']>2 && left<i){
                
                char ch2 = s.charAt(left);
                arr[ch2-'a']--;
                left++;
            }
            
            len = Math.max(len,i-left+1);
        }
        return len;
    }
}