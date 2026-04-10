class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int min = arrays.get(0).get(0);
        int result = 0;

        for(int i=1;i<arrays.size();i++){
            int currMax = arrays.get(i).get(arrays.get(i).size()-1);
            int currMin = arrays.get(i).get(0);
            result = Math.max(result,Math.max(Math.abs(max-currMin),Math.abs(currMax-min)));
            max = Math.max(max,currMax);
            min = Math.min(min,currMin);
            
        }
        return result;
    }
}