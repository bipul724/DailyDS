class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int arr[] = new int[10];

        Set<Integer> set = new HashSet<>();

        for(int num : digits){
            arr[num]++;
        }

        for(int i = 1;i<=9;i++){
            if(arr[i]==0){
                continue;
            }
            arr[i]--;
            for(int j = 0;j<=9;j++){
                if(arr[j]==0){
                    continue;
                }
                arr[j]--;
                for(int k = 0; k<=8;k=k+2){
                    if(arr[k]==0){
                        continue;
                    }
                    int num = (i*100)+(j*10)+k;
                    arr[k]--;
                    
                    set.add(num);
                    arr[k]++;
                }
                arr[j]++;
            }
            arr[i]++;
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int ans[] = new int[list.size()];
        int k = 0;
        for(int x : list){
            ans[k]=x;
            k++;
        }
        return ans;
    }
}