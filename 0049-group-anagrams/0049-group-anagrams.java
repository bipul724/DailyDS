class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i<strs.length;i++){
            String str = strs[i];
            char arr[] = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(str);
            

        }

        for(Map.Entry<String,List<String>> ele : map.entrySet()){
            ans.add(ele.getValue());
        }

        return ans;
    }
}