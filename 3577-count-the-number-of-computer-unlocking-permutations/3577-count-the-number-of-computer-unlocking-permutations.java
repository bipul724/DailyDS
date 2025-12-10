class Solution {
    public long M = 1000000007;
    public long fact(int n){
        if(n==1){
            return 1;
        }
        return (n*fact(n-1))%M;
    }
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        
        for(int i=1;i<n;i++){
            if(complexity[i]<=complexity[0]){
                return 0;
            }
        }
        
        
        
        return (int)fact(n-1);
        
    }
}