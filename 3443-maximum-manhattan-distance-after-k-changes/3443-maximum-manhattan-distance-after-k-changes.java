class Solution {
    public int maxDistance(String s, int k) {
        int n = 0 , st=0,w=0,e=0,steps=0,ans=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='N'){
                n++;
            }
            else if(ch=='S'){
                st++;
            }
            else if(ch=='W'){
                w++;
            }
            else{
                e++;
            }

            int dis = Math.abs(n-st)+Math.abs(w-e);

            steps++;

            int wasted = steps-dis;
            int extra = 0;
            if(wasted!=0){
                extra = Math.min(2*k,wasted);
            }

            int total = extra + dis;

            ans = Math.max(ans,total);
        }
        return ans;
    }
}