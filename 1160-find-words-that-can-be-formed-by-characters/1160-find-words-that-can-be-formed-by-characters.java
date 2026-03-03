class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[] = new int[26];

        for (int i = 0; i < chars.length(); i++) {
            char ch = chars.charAt(i);
            arr[ch-'a']++;
        }

        int res = 0;

        for (String str : words) {
            int arr1[] = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                arr1[ch-'a']++;
            }
            boolean flag = true;

            for(int i=0;i<26;i++){
                if(arr[i]<arr1[i]){
                    flag =false;
                }
            }

            if(flag){
                res+=str.length();
            }
        }
        return res;
    }
}