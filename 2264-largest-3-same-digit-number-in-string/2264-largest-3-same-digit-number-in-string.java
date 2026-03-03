class Solution {
    public String largestGoodInteger(String num) {
        int i=0;
        int curr = 1;
        int j=2;
        int n = num.length();
        
        int count = 0;
        char currNo= ' ' ;
        
        StringBuilder sb = new StringBuilder();

        while(j<n){
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(curr);
            char ch3 = num.charAt(j);
            if(ch1==ch2 && ch2==ch3){
                if(currNo < ch1){
                    sb.setLength(0);
                    sb.append(ch1);
                    sb.append(ch1);
                    sb.append(ch1);
                    currNo =ch1;
                }
            }
            i++;
            curr++;
            j++;
            
        }
        return sb.toString();
    }
}