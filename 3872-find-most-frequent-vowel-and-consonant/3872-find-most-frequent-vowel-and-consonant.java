class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowels = new HashMap<>();
        HashMap<Character,Integer> consonants = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                vowels.put(ch, vowels.getOrDefault(ch, 0) + 1);
            } else {
                
                consonants.put(ch, consonants.getOrDefault(ch, 0) + 1);
            }
        }

        int maxVowel = 0;
        int maxC = 0;

        for (int freq : vowels.values()) {
            maxVowel = Math.max(maxVowel, freq);
        }

        for (int freq : consonants.values()) {
            maxC = Math.max(maxC, freq);
        }

        return maxVowel + maxC;
    }
}