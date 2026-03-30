class Solution {
    public int maximum69Number (int num) {
        int x = 0;
        int y = -1;
        int z= num;

        while(num>0){
            int rem = num%10;
            num/=10;
            if(rem==6){
                y=x;
            }
            x++;
        }
        if(y==-1){
            return z;
        }

        return z + (int)(3*(Math.pow(10,y)));
    }
}