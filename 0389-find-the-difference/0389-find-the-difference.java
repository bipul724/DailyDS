class Solution {
    public char findTheDifference(String s, String t) {
        int dat[] = new int[26];
        for(int i=0;i<s.length();i++){
            dat[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            dat[t.charAt(i)-'a']--;
        }
        int ans=0 ;
        for(int i=0;i<dat.length;i++){
            if(dat[i]==-1){
                ans = i;
                
            }
        }
        return (char)(ans+'a');
    }
}