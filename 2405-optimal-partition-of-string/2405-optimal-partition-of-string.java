class Solution {
    public int partitionString(String s) {
        int count = 0;
        //char []arr = new char[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(map.getOrDefault(ch,0)==1){
                map.clear();
                count++;
                

            }
            
                map.put(ch,1);
            
            
        }
        return count+1;
    }
}