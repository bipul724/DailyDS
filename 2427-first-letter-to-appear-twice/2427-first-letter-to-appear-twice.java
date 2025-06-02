class Solution {
    public char repeatedCharacter(String s) {
        int []dat = new int[26];

        for(int i=0;i<s.length();i++){
            dat[s.charAt(i)-'a']++;
            if(dat[s.charAt(i)-'a']==2){
                return s.charAt(i);
            }
        }
        
        return '\0';
    }
}