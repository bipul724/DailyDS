class Solution {
    public int videoStitching(int[][] clips, int time) {
        int arr[] = new int[time+1];
        
        for(int i=0;i<clips.length;i++){
            int x = clips[i][0];
            int y = clips[i][1];
            if(x>time){
                continue;
            }
            arr[x]=Math.max(arr[x],y);
        }

        int count = 0;
        int n = clips.length;
        int farthest = 0;
        int currEnd = 0;

        for(int i=0;i<=time;i++){
            if(i>farthest){
                return -1;
            }
            if(i>currEnd){
                count++;
                currEnd = farthest;
                if(currEnd>=time){
                    return count;
                }
            }
            farthest = Math.max(farthest,arr[i]);
        }
        if(currEnd>=time){
            return count;
        }
        return -1;
    }
}