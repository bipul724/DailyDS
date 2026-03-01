class Solution {
    public String trimTrailingVowels(String s) {
        int i=0;
        int j=s.length()-1;
        int start = 0;
        int end = s.length()-1;

       
        while(j>=0){
            char ch = s.charAt(j);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                j--;
                end = j;
            }
            else{
                break;
            }
        }

        return s.substring(start,end+1);
    }
}