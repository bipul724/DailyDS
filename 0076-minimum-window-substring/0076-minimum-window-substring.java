class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();

        if(t.length()>n){
            return "";
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        int i = 0;
        int j = 0;
        int count = t.length();
        int minSize = Integer.MAX_VALUE;
        int start = 0;
        while(j<n){
            char ch = s.charAt(j);

            if((map.getOrDefault(ch,0) > 0)){
                count--;
                
            }

            map.put(ch,map.getOrDefault(ch,0)-1);

            while(count==0){
                //minSize = Math.min(minSize,(j-i+1));
                /*if(map.get(ch)==0){*/
                    if(j-i+1 < minSize){
                        minSize = j-i+1;
                        start = i;
                    }

                    char left = s.charAt(i);
                    map.put(left, map.get(left) + 1);

                    if(map.getOrDefault(left,0)>0){
                        count++;
                    }
                    i++;
                
                
            }
            j++;
        }

        if(minSize == Integer.MAX_VALUE){
            return "";
        }
        else{
            return s.substring(start,start+minSize);
        }
    }
}