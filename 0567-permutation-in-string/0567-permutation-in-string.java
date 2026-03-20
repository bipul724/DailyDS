class Solution {
    public boolean check(int[] arr1, int arr2[]) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }

        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int arr[] = new int[26];
        for(char ch : s1.toCharArray()){
            arr[ch-'a']++;
        }
        int i = 0;
        int j = s1.length();
        int arr1[] = new int[26];
        for(int k = 0;k<s1.length();k++){
            
            arr1[s2.charAt(k)-'a']++;
            
        }
        boolean flag = check(arr,arr1);
            if(flag){
                return true;
            }
        while(j<s2.length()){
            arr1[s2.charAt(j)-'a']++;
            if((j-i+1)>s1.length()){
                arr1[s2.charAt(i)-'a']--;
                i++;
            }
            flag = check(arr,arr1);
            if(flag){
                return true;
            }

            j++;
            
        }
        return false;
        
    }
}