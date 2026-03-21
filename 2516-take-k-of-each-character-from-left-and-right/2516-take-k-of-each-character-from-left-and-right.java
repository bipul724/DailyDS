class Solution {
    public int takeCharacters(String s, int k) {
        int i = 0;
        int n = s.length();
        int j = 0;
        int arr[] = new int[3];
        int minute = 0;
        int ans = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
            count++;
        }

        int x = arr[0];
        int y = arr[1];
        int z = arr[2];
        if((x<k || y<k) || z<k){
            return -1;
        }


        while(j<n){
            char ch1 = s.charAt(j);
            arr[ch1-'a']--;
            
            while(i<=j && ((arr[0]<k || arr[1]<k) || arr[2]<k)){
                char ch2 = s.charAt(i);
                arr[ch2-'a']++;
                
                i++;
            }
            ans = Math.max(ans,(j-i+1));
            j++;
        }

        
        return count-ans;
        
    }
}