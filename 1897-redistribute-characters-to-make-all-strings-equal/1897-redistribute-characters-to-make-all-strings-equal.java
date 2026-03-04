class Solution {
    public boolean makeEqual(String[] words) {
        int arr[] = new int[26];
        int n = words.length;
        
        for(String s : words){
            for(char ch : s.toCharArray()){
                arr[ch-'a']++;
            }
        }


        for(int i=0;i<26;i++){
            if(arr[i]%n != 0){
                return false;
            }
        }
        return true;
    }
}