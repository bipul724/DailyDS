class Solution {
    public int minimumDeletions(String word, int k) {
        int arr[] = new int[26];

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            arr[ch-'a']++;
        }

        Arrays.sort(arr);

        int cumSum = 0;
        int ans = word.length();

        for(int i=0;i<26;i++){
            int temp = cumSum;
            for(int j=25;j>=0;j--){
                if(arr[j]-arr[i]<=k){
                    break;
                }
                temp+=arr[j]-arr[i]-k;

            }
            ans =Math.min(ans,temp);
            cumSum += arr[i];
        }
        return ans;
    }
}