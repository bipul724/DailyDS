class Solution {
    public int sum(int n){
        int a = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            a+=rem;
        }
        return a;
    }
    public int countLargestGroup(int n) {
        int arr[] = new int[37];
        int sum = 0;

        for(int i = 1;i<=n;i++){
            // = 0;
            int x = i;
            int result = sum(i);

            arr[result]++;
        }
        int max = 0;
        int count  = 0;

        for(int i = 1;i<37;i++){
           max = Math.max(max,arr[i]);
        }

        for(int i=1;i<37;i++){
            if(max==arr[i]){
                count++;
            }
        }
        return count;
    }
}