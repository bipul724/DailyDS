class Solution {
    public int passThePillow(int n, int time) {
        int cycles = time / (n-1);
        int timeLeft = time % (n-1);

        if(cycles%2==0){
            return timeLeft+1;
        }
        else{
            return n-timeLeft;
        }

        
    }
}