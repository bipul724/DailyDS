class Solution {
    public int firstUniqChar(String s) {
        int dat[] = new int[26];
        for(int i=0;i<s.length();i++){
            dat[s.charAt(i)-'a']++;

        }
        for(int i=0;i<s.length();i++){
            if(dat[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}