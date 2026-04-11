class Solution {
    public int maxDiff(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        StringBuilder sb1 = new StringBuilder(sb);
        StringBuilder sb2 =new StringBuilder(sb);

        char x = ' ';
        for(int i=0;i<sb.length();i++){
            x = sb.charAt(i);
            if(x!='9'){
                break;
            }
        }

        for(int i=0;i<sb.length();i++){
            if(sb1.charAt(i)==x){
                sb1.setCharAt(i,'9');
            }
            
        }

        x = ' ';
        int idx = -1;
        for(int i=0;i<sb.length();i++){
            x = sb.charAt(i);
            if(x!='1' && x!='0'){
                idx=i;

                break;
            }
        }
        
        if(idx==-1){
            int a = Integer.valueOf(sb1.toString());
            int b = Integer.valueOf(sb2.toString());
            return a-b;
        }
        for(int i=0;i<sb.length();i++){
            
            if(sb2.charAt(i)==x && idx==0){
                sb2.setCharAt(i,'1');
            }

            else if(sb2.charAt(i)==x && idx!=0){
                sb2.setCharAt(i,'0');
            }

        }

        int a = Integer.valueOf(sb1.toString());
        int b = Integer.valueOf(sb2.toString());
        System.out.println(a+" "+b+" "+idx);


        return a-b;

        
    }
}