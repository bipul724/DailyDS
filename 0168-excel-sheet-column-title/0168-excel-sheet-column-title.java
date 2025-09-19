class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder sb = new StringBuilder();
        int c = columnNumber;
        while(c>0){
            c--;
            int rem = c % 26;
            char ch = (char)('A'+(rem));
            sb.append(ch);
            c=c/26;
        }

        return sb.reverse().toString();
    }
}