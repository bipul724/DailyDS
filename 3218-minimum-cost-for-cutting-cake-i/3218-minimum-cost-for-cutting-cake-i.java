class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int horz = 1;
        int ver = 1;
        int sum = 0;

        int i = m-2;
        int j =n-2;

        while(i>=0 && j>=0){
            if(horizontalCut[i]>verticalCut[j]){
                sum+=horizontalCut[i]*ver;
                i--;
                horz++;
            }
            else{
                sum+=verticalCut[j]*horz;
                j--;
                ver++;
            }
        }

        while(i>=0){
            sum+=horizontalCut[i]*ver;
                i--;
        }

        while(j>=0){
            sum+=verticalCut[j]*horz;
                j--;
        }

        return sum;

    }
}