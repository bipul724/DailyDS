class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='#' && !st1.isEmpty()){
                st1.pop();
            }
            else if(ch!='#'){ 
                st1.push(ch);
            }
        }

        for(char ch : t.toCharArray()){
            if(ch=='#' && !st2.isEmpty()){
                st2.pop();
            }
             else if(ch!='#'){ 
                st2.push(ch);
            }
        }

        if(st1.size()!=st2.size()){
            return false;
        }

        while(!st1.isEmpty()){
            char ch1 = st1.pop();
            char ch2 = st2.pop();

            if(ch1!=ch2){
                return false;
            }
        }

        return true;

    }
}