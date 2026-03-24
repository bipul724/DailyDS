class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int j = 0;
        int i = 0;
        int n = fruits.length;
        int maxLen = 0;

        while(j<n){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(i<n && map.size()>2){
                map.put(fruits[i],map.getOrDefault(fruits[i],0)-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            maxLen = Math.max(maxLen,(j-i+1));
            j++;
        }

        return maxLen;
    }
}