class Solution {
    public int minFlips(String s) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int flip1 = 0;
        int flip2 = 0;
        int min = Integer.MAX_VALUE;

        while (j < 2*n) {
            char ch1 = (j % 2 == 1) ? '1' : '0';
            char ch2 = (j % 2 == 1) ? '0' : '1';

            if (s.charAt(j % n) != ch1) {
                flip1++;
            }

            if (s.charAt(j % n) != ch2) {
                flip2++;
            }

            if ((j - i + 1) > n) {
                char ch3 = (i % 2 == 1) ? '1' : '0';
                char ch4 = (i % 2 == 1) ? '0' : '1';

                if (s.charAt(i % n) != ch3) {
                    flip1--;
                }

                if (s.charAt(i % n) != ch4) {
                    flip2--;
                }
                i++;
            }

            

            if((j-i+1)==n){
                min = Math.min(min,Math.min(flip1,flip2));
            }

            j++;
        }

        return min;
    }
}