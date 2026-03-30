class Solution {
    public int minDeletions(String s) {
        int n = s.length();
        int arr[] = new int[26];
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<n;i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }

        int count = 0;

        for(int i = 0;i<26;i++){
            int x = arr[i];
            while(x>0 && set.contains(x)){
                x--;
                count++;
            }
            if(x>0){
                set.add(x);
            }
        }
        return count;
    }
}