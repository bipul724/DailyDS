class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();

        if(n==1){
            return "";
        }
        
        for(int i = 0; i<(n/2);i++){
            char ch = palindrome.charAt(i);
            if(ch!='a'){
                palindrome = palindrome.substring(0,i)+'a'+
                                palindrome.substring(i+1,n);
                break;
            }
            if(i==(n/2)-1){
                return palindrome.substring(0,n-1)+'b';
            }
        }

        return palindrome;
    }
}