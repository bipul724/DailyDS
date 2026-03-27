class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int diff = 0;
        int neg = 0;
        int idx=0;
        //int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            diff+=gas[i]-cost[i];
            neg+=gas[i]-cost[i];
            if(neg<0){
                idx=i+1;
                neg=0;
            }

        }
        if(diff<0){
            return -1;
        }
        return idx;
    }
}