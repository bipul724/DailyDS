class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int right = 0;right<=s.length()-10;right++){
            String str = s.substring(right,right+10);
            map.put(str,map.getOrDefault(str,0)+1);
            if(map.get(str)==2){
                arr.add(str);
            }


        }
        return arr;
    }
}