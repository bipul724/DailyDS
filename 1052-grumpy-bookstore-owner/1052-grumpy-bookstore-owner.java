class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }
        }
        int i = 0;
        int n = customers.length;
        int j = minutes;
        int count = sum;
        while(j<n){
            if(grumpy[j]==1){
                count+=customers[j];
            }
            if(grumpy[i]==1){
                count-=customers[i];
            }
            sum = Math.max(count,sum);
            i++;
            j++;
        }
        for(int k=0;k<n;k++){
            if(grumpy[k]==0){
                sum+=customers[k];
            }
        }
        return sum;
    }
}