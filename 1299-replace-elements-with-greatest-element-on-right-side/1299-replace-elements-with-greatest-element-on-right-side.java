class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];
        int j = n-2;
        arr[n-1]=-1;

        while(j>=0){
            int x = arr[j];
            arr[j] = max;

            max = Math.max(max,x);
            j--;
        }

        return arr;
    }
}