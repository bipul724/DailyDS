class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag = false;
        int i = 0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                flag = true;
                
            }
            else if(flag==true && s.charAt(i)=='0'){
                break;
            }
        }

        for(int j=i;j<s.length();j++){
            if(s.charAt(j)=='1'){
                return false;
            }
        }
        return true;
    }
}