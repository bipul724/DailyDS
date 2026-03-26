class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int max = 0;
        int score = 0;

        int i = 0;
        int j = tokens.length-1;

        Arrays.sort(tokens);

        while(i<=j){

            if(power>=tokens[i]){
                power-=tokens[i];
                score++;
                i++;
                max = Math.max(score,max);
            }
            else if(score>=1){
                power+=tokens[j];
                score--;
                j--;
            }
            else{
                return max;
            }
        }

        return max;
    }
}