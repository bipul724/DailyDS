class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        ArrayList<Integer> arr = new ArrayList();
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue()==nums.length){
                arr.add(i.getKey());
            }
        }
        Collections.sort(arr);
        return arr;
    }
}