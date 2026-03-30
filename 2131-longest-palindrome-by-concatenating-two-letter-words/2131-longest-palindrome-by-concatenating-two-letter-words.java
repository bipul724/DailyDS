class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int count = 0;
        boolean flag = false;

        for (String str : words) {
            String rev = new StringBuilder(str).reverse().toString();

            if (!str.equals(rev)) {
                
                if (map.getOrDefault(str,0) >= 1 
                && map.getOrDefault(rev,0) >= 1) {

                    count += 4;
                    map.put(str, map.get(str) - 1);
                    map.put(rev, map.get(rev) - 1);
                }
            } else {
                if (map.getOrDefault(str,0) == 1 && !flag) {
                    count += 2;
                    flag = true;
                    map.remove(str);
                } else {
                    if (map.getOrDefault(str,0) >= 2) {
                        count += 4;
                        map.put(str, map.get(str) - 2);
                    }
                }
            }
        }
        return count;
    }
}