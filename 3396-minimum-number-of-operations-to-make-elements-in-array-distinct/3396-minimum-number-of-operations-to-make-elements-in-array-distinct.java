class Solution {
    public int minimumOperations(int[] nums) {
        int i = nums.length-1;
        int n = nums.length;
        
        int arr[] = new int[101];
        boolean flag = false;
        while(i>=0){
            int x = nums[i];
            arr[x]++;
            if(arr[x]>1){
                flag = true;
                break;
            }
            i--;
        }
        if(i==-1){
            return 0;
        }
        
        if((i+1)%3==0){
            return (i+1)/3;
        }
        return ((i+1)/3)+1;
    }
}