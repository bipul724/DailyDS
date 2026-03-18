class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        boolean flag1 = true;
        boolean flag2 = true;
        int x=-1,y=-1;
        for(int i=0;i<s1.length();i++){
            if(flag1 && s1.charAt(i)!=s2.charAt(i)){
                x=i;
                flag1=false;
            }
            else if(flag2 && s1.charAt(i)!=s2.charAt(i)){
                y=i;
                flag2=false;
            
            }
            
            if(x!=-1 && y!=-1){
                break;
            }
            
        }
         if(x==-1 || y==-1){
            return false;
        }
        System.out.println(x);
        System.out.println(y);
        char ch1 = s2.charAt(x);
        char ch2 = s2.charAt(y);
        s2 = s2.substring(0,x)+ch2+s2.substring(x+1);
        s2 = s2.substring(0,y)+ch1+s2.substring(y+1);

        if(s1.equals(s2)){
            return true;
        }
        System.out.println(s2);
        return false;

    }
}