class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        HashSet<Integer> set1 = new HashSet<>();
        

        for(int i=0;i<friendships.length;i++){
            int u = friendships[i][0]-1;
            int v = friendships[i][1]-1;
            HashSet<Integer> set = new HashSet<>();
            for(int x : languages[u]){
                set.add(x);
            }
            boolean flag = false;
            for(int y : languages[v]){
                if(set.contains(y)){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                set1.add(u);
                set1.add(v);
            }
        }

        int arr[] = new int[n+1];
        int max = 0;
        for(int x : set1){
            for(int y : languages[x]){
                arr[y]++;
                max = Math.max(max,arr[y]);
            }
        }

        return set1.size()-max;
    }
}