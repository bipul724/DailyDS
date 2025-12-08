class Solution {
    public boolean isInteger(int res)
    {
        int x = (int)Math.sqrt(res);
        if (x * x == res)
            return true;

        else{
            return false;
        }
    }
    public int countTriples(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int res = ((i*i)+(j*j));
                if(isInteger(res) && res<=n*n){
                    count++;
                }
            }
        }
        return count;
    }
}