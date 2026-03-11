class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int odd = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2!=0){
                odd++;
            }
            else{
                odd--;
            }
        }
        if(odd>0){
            return n-odd+1;
        }
        return n;
    }
}