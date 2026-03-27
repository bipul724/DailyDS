class Solution {
    public int minCost(String colors, int[] neededTime) {

        int minTime = 0;

        int x = neededTime[0];
        int y=0;

        for(int i = 1;i<colors.length();i++){
            char ch1 = colors.charAt(i-1);
            char ch2 = colors.charAt(i);

            if(ch1==ch2){
                
                y = neededTime[i];

                minTime += Math.min(x,y);

                x= Math.max(x,y);



            }
            else{
                x = neededTime[i];
            }
        }

        return minTime;
    }
}