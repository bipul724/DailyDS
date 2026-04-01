class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = -1;

        for(int num : nums){
            max = Math.max(max,num);
        }

        int arr[] = new int[max+nums.length];

        for(int x : nums){
            arr[x]++;
        }
        int moves = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=1){
                continue;
            }
            int extra = arr[i]-1;
            arr[i+1]+=extra;
            moves+=extra;
        }
        return moves;
    }
}