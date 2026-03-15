class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count = 0;
        for(String str : words){
            boolean flag = true;
            for(int i=0;i<str.length();i++){
                if(!allowed.contains(String.valueOf(str.charAt(i)))){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}