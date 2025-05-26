class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);

        }


        for(int i=0;i<ransomNote.length();i++){
            Character c = ransomNote.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}