class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[i]<=prices[st.peek()]){
                ans[st.peek()]=prices[st.peek()]-prices[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=prices[st.peek()];
            st.pop();
        }
        return ans;
    }
}