class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle.length()==0 || columnTitle==null){
            return 0;
        }
        int sum = 0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int val = ch-'A'+1;
            sum = sum * 26 + val; 
        }
        return sum;


    }
}