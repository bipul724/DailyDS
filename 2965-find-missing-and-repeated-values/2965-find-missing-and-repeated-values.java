class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n+2];
        int count = -1;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                arr[grid[i][j]]++;
                if(arr[grid[i][j]]>1){
                    count = grid[i][j];
                    
                }
            }
        }
        int d = (n*n);
        int total = ((d)*(d+1))/2;
        System.out.println(sum);
        System.out.println(total);

        int missing = 0;
        sum-=count;
        missing = total-sum;
        // if(sum>total){
        //     sum-=count;
        //     missing = total-sum;

        // }
        // else{
        //     total-=count;
        //     missing = sum-total;
        // }
        

        

        return new int[]{count,missing};



    }
}