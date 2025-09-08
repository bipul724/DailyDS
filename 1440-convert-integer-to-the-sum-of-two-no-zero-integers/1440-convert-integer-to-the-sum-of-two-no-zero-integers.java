class Solution {
    public boolean valid(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n = n/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int ans[] = new int[2];
        for(int i=1;i<n;i++){
            int a = n - i;
            int b = i;
            if(valid(a) && valid(b)){
                ans[0]=a;
                ans[1]=b;
                break;
            }
        }
        return ans;
    }
}