class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        int alice = 0;
        int bob = 0;
        if(n<=2){
            return false;
        }
        for (int i = 0; i < n - 2; i++) {
            char a = colors.charAt(i);
            char b = colors.charAt(i + 1);
            char c = colors.charAt(i + 2);

            if (a == b && b == c) {
                if (a == 'A') {
                    alice++;
                } else {
                    bob++;
                }
            }
        }

        return (alice>bob) ? true : false;
    }
}