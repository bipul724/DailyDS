class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        int x =0;
        int y=0;

        set.add("0,0");

        for(int i=0;i<path.length();i++){
            char ch = path.charAt(i);
            if(ch=='N'){
                x++;
            }
            if(ch=='S'){
                x--;
            }
            if(ch=='E'){
                y++;
            }
            if(ch=='W'){
                y--;
            }
            String pos = x+","+y;
            if(set.contains(pos)){
                return true;
            }
            set.add(pos);
        }
        return false;
    }
}