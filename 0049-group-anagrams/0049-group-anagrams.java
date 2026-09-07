class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;

        for(int i=0;i<n;i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());

    }
}