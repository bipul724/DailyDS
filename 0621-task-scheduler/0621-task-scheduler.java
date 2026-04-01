class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr[] = new int[26];

        for(int i=0;i<tasks.length;i++){
            char ch = tasks[i];
            arr[ch-'A']++;
        }

        Arrays.sort(arr);

        int maxFreq = arr[25];
        int x = (maxFreq-1);
        int idleSpot = (maxFreq-1)*(n);


        for(int i=24;i>=0;i--){
            idleSpot-=Math.min(x,arr[i]);
        }

        if(idleSpot<=0){
            return tasks.length;
        }
        return tasks.length+idleSpot;
    }
}