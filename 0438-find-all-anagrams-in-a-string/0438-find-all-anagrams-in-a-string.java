class Solution {

    public boolean allZero(int []freq){
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();

        List<Integer> ans = new ArrayList<>();
        int []freq = new int[26];

        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }

        int i = 0;
        int j = 0;
        

        while(j<s.length()){
            freq[s.charAt(j)-'a']--;

            if((j-i)+1 == n){
                if(allZero(freq)){
                    ans.add(i);

                }

                freq[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }

        return ans;
    }
}