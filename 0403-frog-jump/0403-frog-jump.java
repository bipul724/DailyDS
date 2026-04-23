class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int n;
    int t[][] = new int[2001][2001];
    boolean solve(int[] stones,int csi,int pj){
        if(csi==n-1){
            return true;
        }
        boolean result = false;

        if(t[csi][pj]!=-1){
            return t[csi][pj]==1;
        }
        for(int i=pj-1;i<=pj+1;i++){
            if(i>0){
                int nextStone = stones[csi]+i;
                if(map.containsKey(nextStone)){
                    result = result || solve(stones,map.get(nextStone),i);
                }
            }
        }
        t[csi][pj] = result ? 1 : 0;
        return result;
    }
    public boolean canCross(int[] stones) {
        n = stones.length;
        if(stones[1]!=1){
            return false;
        }

        for(int i=0;i<n;i++){
            map.put(stones[i],i);
        }
        for(int i=0;i<2001;i++){
            Arrays.fill(t[i],-1);
        }
        
        return solve(stones,0,0);
    }
}