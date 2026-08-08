class Solution {
    public void solve(List<String> ans,StringBuilder sb,int open,int close,int total){
        if(sb.length()==total*2){
            ans.add(sb.toString());
            return;
        }
        if(open<total){
            //open++;
            sb.append('(');
            solve(ans,sb,open+1,close,total);
            sb.deleteCharAt(sb.length()-1);

        }
        if(close<open){
            //close++;
            sb.append(')');
            solve(ans,sb,open,close+1,total);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(ans,sb,0,0,n);
        return ans;
    }
}