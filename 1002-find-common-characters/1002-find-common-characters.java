class Solution {
    public void count(String word,int []arr){
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i) - 'a']++;
        }
    }
    public List<String> commonChars(String[] words) {
        int arr[] = new int[26];

        count(words[0],arr);

        for(String str : words){
            int temp[] = new int[26];
            count(str,temp);

            for(int j=0;j<26;j++){
                arr[j]=Math.min(arr[j],temp[j]);
            }

        }

        List<String> list = new ArrayList<>();

        for(int i=0;i<26;i++){
            while(arr[i]!=0){
                list.add("" + (char)(i + 'a'));
                arr[i]--;
            }
            
        }

        return list;



    }
}