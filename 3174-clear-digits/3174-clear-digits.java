class Solution {
    public String clearDigits(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(ch);
            }
            
        }

        // while(!st.isEmpty()){
        //     System.out.println(st.peek());
        //     sb.append(st.pop());
        // }
        // sb.reverse();

        return sb.toString();
    }
}