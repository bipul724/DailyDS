class Solution {
    public int longestPalindrome(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);

            }
            boolean flag = false;
            int ans = 0;

            for(int freq : map.values()){
                if(freq%2==0){
                    ans+=freq;
                }
                else{
                    ans+=freq-1;
                    flag = true;
                }
            }
            if(flag){
                ans++;
            }
            return ans;
    }
}