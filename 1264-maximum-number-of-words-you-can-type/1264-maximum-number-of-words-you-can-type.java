class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count=0;
        for(String str : arr){
            boolean flag = false;
            for(char ch : brokenLetters.toCharArray()){
                if(str.indexOf(ch) != -1){
                    flag = true;
                }
            }
            if(!flag){
                count++;
            }
        }
        return count;
    }
}