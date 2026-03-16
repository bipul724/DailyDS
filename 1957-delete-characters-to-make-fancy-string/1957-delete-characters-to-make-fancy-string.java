class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int freq = 1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(sb.charAt(sb.length()-1)==ch){
                freq++;
                if(freq>=3){
                    continue;
                }
                sb.append(String.valueOf(ch));
            }
            else{
                freq=1;
                sb.append(String.valueOf(ch));
            }
            
        }
        return sb.toString();
    }
}