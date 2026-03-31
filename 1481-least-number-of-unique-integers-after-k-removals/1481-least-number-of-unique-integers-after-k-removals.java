class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count = map.size();

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        for(int freq : list){
            
            if(k>=freq){
                count--;
                k-=freq;
            }
            else{
                break;
            }
        }

        return count;
    }
}