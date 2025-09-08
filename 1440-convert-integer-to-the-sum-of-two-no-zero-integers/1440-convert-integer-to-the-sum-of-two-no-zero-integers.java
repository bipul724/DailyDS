class Solution {
    public int[] getNoZeroIntegers(int n) {
        int ans[] = new int[2];
        for(int i=1;i<=n;i++){
            int a = n - i;
            int b = i;
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")){
                ans[0]=a;
                ans[1]=b;
            }
        }
        return ans;
    }
}