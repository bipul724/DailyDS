class Solution {
    public String reversePrefix(String word, char ch) {
        int x = word.indexOf(ch);

        StringBuilder sb = new StringBuilder(word.substring(0,x+1));
        sb.reverse();
        sb.append(word.substring(x+1));

        return sb.toString();
    }
}