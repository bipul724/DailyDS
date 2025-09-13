class Solution {
    public boolean doesAliceWin(String s) {
        HashSet<Character> set = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u')
        );

        for(char c : s.toCharArray()){
            if(set.contains(c)){
                return true;
            }
        }
        return false;


    }
}