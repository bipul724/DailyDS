class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0;i<rocks.length;i++){
            arr.add(capacity[i]-rocks[i]);
        }

        Collections.sort(arr);
        int count = 0;
        int i = 0;

        while(i<arr.size() && additionalRocks>0){
            
            if(additionalRocks>=arr.get(i)){
                additionalRocks-=arr.get(i);
                count++;
            }
            else{
                break;
            }
            i++;
            
        }
        return count;
    }
}