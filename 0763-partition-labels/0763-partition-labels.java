class Solution {
    public List<Integer> partitionLabels(String s) {
        int start[] = new int[26];
        start[s.charAt(0)-'a']=0;
        int end[] = new int[26];

        for(int i = 1;i<s.length();i++){
            if(start[s.charAt(i)-'a']==0){
                start[s.charAt(i)-'a']=i;
                
            }
            
        }

        for(int i = s.length()-1;i>=0;i--){
            if(end[s.charAt(i)-'a']==0){
                end[s.charAt(i)-'a']=i;
                
            }
            
        }

        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int x = end[s.charAt(0)-'a'];
        

        while(j<s.length()){
            char ch = s.charAt(j);
            if(end[ch-'a']>x){
                x= end[ch-'a'];
            }
            if(j==x){
                list.add(j);
            }
            j++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(list.get(0)+1);
        for(int k = 1;k<list.size();k++){
            
            
                ans.add(list.get(k)-list.get(k-1));
            
        }
        return ans;
    }
}