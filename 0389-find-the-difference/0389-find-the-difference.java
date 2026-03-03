class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        int i = 0;
        for(i=0;i<s.length();i++){
            xor = xor^s.charAt(i);
            xor = xor^t.charAt(i);
        }

        xor = xor^t.charAt(i);
        return (char)xor;
    }
}