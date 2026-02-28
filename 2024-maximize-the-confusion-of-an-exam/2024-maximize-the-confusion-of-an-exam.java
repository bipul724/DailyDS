class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i=0;
        int j = 0;
        int n = answerKey.length();
        int countT = 0;
        int countF = 0;
        int maxLen = 0;

        

        while(j<n){
            char ch = answerKey.charAt(j);
            if(ch=='T'){
                countT++;
            }
            if(ch=='F'){
                countF++;
            }
            
            while(Math.min(countT,countF)>k){
                if(answerKey.charAt(i)=='T'){
                    countT--;
                }
                if(answerKey.charAt(i)=='F'){
                    countF--;
                }
                i++;

            }
            
            maxLen = Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}