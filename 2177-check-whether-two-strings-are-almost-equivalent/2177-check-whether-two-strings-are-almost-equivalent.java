class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int dat1[] = new int[26];
        int dat2[] = new int[26];

        for(int i=0;i<word1.length();i++){
            dat1[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            dat2[word2.charAt(i)-'a']++;
        }

        for(int i=0;i<=25;i++){
            if(Math.abs(dat1[i]-dat2[i])>3){
                return false;
            }

        }
        return true;
    }
}