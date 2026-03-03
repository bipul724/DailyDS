class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int j = n-1;
        int end = -1;
        while(j>=0){
            int ch = num.charAt(j);
            if(ch%2!=0){
                end = j;
                break;
            }
            j--;
        }
        if(end==-1){
            return "";
        }
        return num.substring(0,end+1);
    }
}