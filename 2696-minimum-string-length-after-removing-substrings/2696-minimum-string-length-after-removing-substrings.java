class Solution {
    public int minLength(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty()) {
                if (st.peek() == 'A' && ch == 'B') {
                    st.pop();
                    continue;
                }
                
                if (st.peek() == 'C' && ch == 'D') {
                    st.pop();
                    continue;
                }

            }
            
            st.push(ch);
            
        }
        return st.size();
    }
}