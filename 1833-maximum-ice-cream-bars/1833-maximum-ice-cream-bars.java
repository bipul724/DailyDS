class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count = 0;

        for(int num : costs){
            if(num<=coins){
                coins-=num;
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }
}