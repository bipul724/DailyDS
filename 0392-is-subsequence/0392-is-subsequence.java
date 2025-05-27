class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
        }
        if(s.length()!=i){
            return false;
        }
        return true;
    }
}