class Solution {
    public int minOperations(String s) {
        char x = '0';
        int count1 = 0;

        if(s.charAt(0)!=x){
            count1++;
        }
        

        for(int i=1;i<s.length();i++){
            if(x=='0'){
                x='1';
            }
            else{
                x='0';
            }
            char ch = s.charAt(i);
            if(ch!=x){
                count1++;
            }
        }
        x = '1';
        int count2 = 0;
        if(s.charAt(0)!=x){
            count2++;
        }
        for(int i=1;i<s.length();i++){
            if(x=='0'){
                x='1';
            }
            else{
                x='0';
            }
            char ch = s.charAt(i);
            if(ch!=x){
                count2++;
            }
        }
        return Math.min(count1,count2);
    }
}