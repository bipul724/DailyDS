class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }
        int length = 0;
        int max = 0;
        int c  =0;
        for(Character key : map.keySet()){
            if(map.get(key)%2==0){
                length = length + map.get(key);
            }
            else{
                length = length + (map.get(key)-1);
                c++;
            }

        }
        if(c>0)
        length +=1;

        return length;
    }
}