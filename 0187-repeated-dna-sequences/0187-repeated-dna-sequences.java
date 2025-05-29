class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        HashSet<String> map = new HashSet<>();
        
        
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int right = 0;right<=s.length()-10;right++){
            String str = s.substring(right,right+10);
            if(!map.add(str)){
                if(!arr.contains(str)){
                     arr.add(str);
                }

            };
            


        }
        return arr;
    }
}