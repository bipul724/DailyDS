class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int length = 0;
        int same = 0;

        if(words.length==1 && words[0].charAt(0)!=words[0].charAt(1) ){
            return 0 ;
        }

        for(int i=0;i<words.length;i++){
            
            String s = words[i];
            
            StringBuilder sb = new StringBuilder(s);
            String rev = sb.reverse().toString();
            if(map.containsKey(rev)){
                map.put(rev,map.get(rev)-1);
                if(map.get(rev)==0){
                    map.remove(rev);
                }
                length = length + 4;
            }
            else{
                map.put(s,map.getOrDefault(s,0)+1);

            }
            


            
        }
        int max = 0;
        int curr = 0;

        for(String s : map.keySet()){
            // String s = map.get();
            if(s.charAt(0)==s.charAt(1) && map.get(s)%2==0){
                
                max = Math.max(max,map.get(s));
                


            }
            else if(s.charAt(0)==s.charAt(1) && map.get(s)==1){
                max = Math.max(max,map.get(s));
            }
        }
        length = length + (max*2);
        


        
        return length;
    }
}