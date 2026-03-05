class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = 0;
        int i=0,j=0,n=s.length();

        int arr[] = new int[26];
        Arrays.fill(arr,-1);
        boolean flag = true;

        for(i=0;i<n;i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']!=-1){
                maxLen = Math.max(maxLen,i-arr[ch-'a']-1);
                flag = false;
            }
            else{
                arr[ch-'a']=i;
            }
            
        }
        if(flag){
            return -1;
        }
        return maxLen;
    }
}