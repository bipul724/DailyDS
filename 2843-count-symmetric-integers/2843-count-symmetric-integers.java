class Solution {
    public boolean check2(int n){
        int x = n%10;
        n = n/10;
        int y = n%10;

        return x==y;
    }
    public boolean check4(int n){
        int x = n%10;
        n = n/10;
        x+=n%10;
        n=n/10;
        int y = n%10;
        n = n/10;
        y+=n%10;

        return x==y;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int i=low;i<=high;i++){
            if((i>=1 && i<=9) || (i>=100 && i<=999) || i==10000){
                continue;
            }
            if(i>=10 && i<=99 && check2(i)){
                System.out.println(i);
                count++;
            }
            else if(i>=1000 && i<=9999 && check4(i)){
                System.out.println(i);
                count++;
            }
            
        }
        return count;
    }
}