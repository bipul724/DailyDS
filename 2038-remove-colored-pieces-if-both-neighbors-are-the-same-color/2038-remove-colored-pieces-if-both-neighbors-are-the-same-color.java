class Solution {
    public boolean winnerOfGame(String colors) {
        int a = 0;
        int b = 0;
        int i = 0;
        int j = 0;
        int n = colors.length();

        while (j < n) {
            while (j < n - 1 && colors.charAt(j) == colors.charAt(j + 1)) {
                j++;
            }

            while(i < j - 1 && (j - i + 1) >= 3) {
                char x = colors.charAt(i);
                char y = colors.charAt(i + 1);
                char z = colors.charAt(i + 2);
                if (x == y && z == x) {
                    if (colors.charAt(i) == 'A') {
                        a++;
                    } else {
                        b++;
                    }
                }

                i++;
            }
            j++;
        }
        System.out.println("A " + a);
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("B " + b);
        if (a > b) {
            return true;
        }
        return false;
    }
}