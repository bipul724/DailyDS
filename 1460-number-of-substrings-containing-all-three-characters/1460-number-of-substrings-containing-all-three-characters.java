class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int []arr = new int[3];
        int l =0;
        int sum  = 0;

        for(int r=0;r<n;r++){
            arr[s.charAt(r)-'a']++;

            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                sum += (n-r);
                arr[s.charAt(l)-'a']--;
                l++;
            }
        }

        return sum;
    }
}