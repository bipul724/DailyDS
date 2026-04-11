class Solution {
    public int find(int[] tops, int[] bottoms,int val){
        int swapTop=0;
        int swapBottom=0;
        int n = tops.length;

        for(int i=0;i<n;i++){
            if(tops[i]!=val && bottoms[i]!=val){
                return -1;
            }
            else if(tops[i]!=val){
                swapTop++;
            }
            else if(bottoms[i]!=val){
                swapBottom++;
            }
        }
        return Math.min(swapTop,swapBottom);
    }
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int count = Integer.MAX_VALUE;
        for(int i=1;i<=6;i++){
            int swap = find(tops,bottoms,i);
            if(swap!=-1){
                count = Math.min(count,swap);
            }
        }
        return count==Integer.MAX_VALUE ? -1 : count;
    }
}