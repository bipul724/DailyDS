class Solution {
    Random rand = new Random();
    public void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void quicksort(int []arr,int low,int high){
        if(low<high){
            int x = partition(arr,low,high);
            quicksort(arr,low,x-1);
            quicksort(arr,x+1,high);
        }
    }
    public int partition(int []arr,int low,int high){
       int pivotIndex = low + rand.nextInt(high - low + 1);
        swap(arr, pivotIndex, high);

        int pivot = arr[high]; 
        int i = low - 1;       
   

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1; 
    }
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }
}