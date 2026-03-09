class Solution {
    public int Tn(int []num,int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(num[n]!=0){
            return num[n];
        }
        num[n]=Tn(num,n-3)+Tn(num,n-1)+Tn(num,n-2);
        return num[n];
    }
    public int tribonacci(int n) {
        int num[]=new int[n+1];
        int ans = Tn(num,n);
        return ans;
    }
}