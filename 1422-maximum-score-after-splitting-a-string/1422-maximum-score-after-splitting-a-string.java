class Solution {
    public int maxScore(String s) {
        int zl = 0;
        int ol = 0;
        int n = s.length();
        int score = -1;

        for(int i=0;i<=n-2;i++){
            if(s.charAt(i)=='0'){
                zl++;
            }
            else{
                ol++;
            }
            score = Math.max(score,zl-ol);
        }

        if(s.charAt(n-1)=='1'){
            ol++;
        }
        return score+ol;
    }
}