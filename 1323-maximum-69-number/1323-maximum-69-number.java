class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));

        int n = sb.length();

        for(int i = 0;i<n;i++){
            char ch = sb.charAt(i);
            if(ch=='6'){
                sb.setCharAt(i,'9');
                break;
            }
        }

        return Integer.valueOf(sb.toString());
    }
}