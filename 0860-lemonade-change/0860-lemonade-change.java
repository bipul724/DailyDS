class Solution {
    public boolean lemonadeChange(int[] bills) {
        int x5 = 0;
        int x10 = 0;
        int x20 = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                x5++;
            }
            else if(bills[i]==10){
                if(x5>0){
                    x5--;
                    x10++;
                }
                else{
                    return false;
                }
            }
            else{
                if(x5>0 && x10>0){
                    x5--;
                    x10--;
                    x20++;
                }
                else if(x5>=3){
                    x5-=3;
                    x20++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}