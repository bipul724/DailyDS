class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        boolean flag[] = new boolean[26];
        Arrays.fill(arr,-1);
        

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']==-1){
                arr[ch-'a'] = i;
                flag[ch-'a']=true;
            }
            else{
                flag[ch-'a']=false;
            }

        }

        int idx = Integer.MAX_VALUE;

        for(int i=0;i<26;i++){
            if(flag[i]==true){
                idx = Math.min(idx,arr[i]);
            }
        }

        return idx == Integer.MAX_VALUE ? -1 : idx;
    }
}