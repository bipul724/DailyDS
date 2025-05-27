class Solution {
    public boolean areOccurrencesEqual(String s) {
        int dat[] = new int[26];
        for(int i=0;i<s.length();i++){
            dat[s.charAt(i)-'a']++;
        }
        int x = 0;
        for(int i=0;i<dat.length;i++){
            if(x==0){
                x = dat[i];
            }
            if((x!=0 && x!=dat[i]) && dat[i]!=0){
                return false;
            }
            

        }
        return true;
    }
}