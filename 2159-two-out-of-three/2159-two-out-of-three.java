class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }
        for(int j : nums2){
            set2.add(j);
        }
        for(int k : nums3){
            set3.add(k);
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : set1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : set2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : set3){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue()>1){
                arr.add(i.getKey());
            }

        }
        return arr;
    }
}