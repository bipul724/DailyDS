class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumed = numBottles;
        int emptyBottles = numBottles;

        while(emptyBottles >= numExchange){
            int newBottles = emptyBottles/numExchange;
            emptyBottles = emptyBottles%numExchange;

            consumed += newBottles;
            emptyBottles+=newBottles;
            
        }


        return consumed;
    }
}