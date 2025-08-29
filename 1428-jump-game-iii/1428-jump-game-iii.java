class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        int []visited = new int[arr.length];
        
        q.add(start);

        while(!q.isEmpty()){
            int x = q.poll();

            

            if(arr[x]==0){
                return true;
            }

            

            

            int left = x - arr[x];
            int right = x + arr[x];

            // if((left>=0  && visited[left]==1) || (right<arr.length  && visited[right]==1)){
            //     continue;
            // }

            if((left>=0 && visited[left]==0) && left!=start){
                q.add(left);
                visited[left]=1;
            }
            
            if((right<arr.length && visited[right]==0) && right!=start){
                q.add(right);
                visited[right]=1;
            }
            

        }
        return false;
    }
}