class Solution {
    public int minTaps(int n, int[] ranges) {
        int arr[] = new int[n+1];

        for(int i=0;i<ranges.length;i++){
            int x = Math.max(0,i-ranges[i]);
            int y = Math.min(i+ranges[i],n);
            arr[x]=Math.max(arr[x],y);
        }

        int farthest = 0;
        int currEnd =0;

        int count = 0;

        for(int i=0;i<n+1;i++){
            if(i>farthest){
                return -1;
            }
            if(i>currEnd){
                count++;
                currEnd = farthest;
            }
            farthest = Math.max(farthest,arr[i]);
        }
        return count;

    }
}