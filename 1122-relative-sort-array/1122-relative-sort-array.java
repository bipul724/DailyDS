class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }

        int n = arr1.length;

        int []ans = new int[n];
        int k = 0;

        for(int i=0;i<arr2.length;i++){
            int x = arr2[i];
            int freq = map.get(x);
            while(freq>0){
                ans[k]=x;
                k++;
                freq--;
            }
            if(freq==0){
                map.remove(x);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : map.keySet()){
            for(int j=0;j<map.get(num);j++){
                arr.add(num);
            }
           
        }

        Collections.sort(arr);

        for(int i=0;i<arr.size();i++){
            ans[k]=arr.get(i);
            k++;
        }

        return ans;

    }
}