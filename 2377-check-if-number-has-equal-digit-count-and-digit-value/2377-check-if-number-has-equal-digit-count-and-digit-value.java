class Solution {
    public boolean digitCount(String num) {
        int digit[] = new int[10];
        for(int i=0;i<num.length();i++){
            digit[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if((num.charAt(i)-'0')!=digit[i]){
                return false;
            }
        }
        return true;
    }
}