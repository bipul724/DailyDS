class Solution {
    public String maskVowels(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> masked = new HashMap<>();

        for (String word : wordlist) {
            exact.add(word);
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            String mask = maskVowels(word);
            masked.putIfAbsent(mask, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {
                result[i] = q;
                continue;
            }
            String lowerQ = q.toLowerCase();
            if (caseInsensitive.containsKey(lowerQ)) {
                result[i] = caseInsensitive.get(lowerQ);
                continue;
            }
            String maskQ = maskVowels(q);
            if (masked.containsKey(maskQ)) {
                result[i] = masked.get(maskQ);
                continue;
            }
            result[i] = "";
        }
        return result;



    }
}