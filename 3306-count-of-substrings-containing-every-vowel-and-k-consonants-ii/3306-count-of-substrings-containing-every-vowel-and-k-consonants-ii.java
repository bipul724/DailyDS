class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public long countOfSubstrings(String word, int k) {
        int n = word.length();
        int []arr = new int[n];
        int lastIdx = n;
        for(int i=n-1;i>=0;i--){
            arr[i]=lastIdx;
            if(!isVowel(word.charAt(i))){
                lastIdx = i;
            }
        }

        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        long count = 0 ;
        int cons = 0;

        while(j<n){
            char ch = word.charAt(j);
            if(isVowel(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
                cons++;
            }

            while(cons>k){
                char ch1 = word.charAt(i);
                if(isVowel(ch1)){
                    map.put(ch1, map.getOrDefault(ch1, 0) - 1);
                    if(map.get(ch1)==0){
                        map.remove(ch1);
                    }
                }
                else{
                    cons--;
                }
                i++;
            }

            while(i<n && cons==k && map.size()==5){
                count+=arr[j]-j;
                char ch1 = word.charAt(i);
                if(isVowel(ch1)){
                    map.put(ch1, map.getOrDefault(ch1, 0) - 1);
                    if(map.get(ch1)==0){
                        map.remove(ch1);
                    }
                }
                else{
                    cons--;
                }
                i++;
            }


            j++;





        }
        return count;
    }
}