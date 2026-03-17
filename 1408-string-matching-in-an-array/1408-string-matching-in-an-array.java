class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(words[i])){
                    set.add(words[i]);
                }
            }
        }
        for(String str : set){
            ans.add(str);
        }
        return ans;
    }
}