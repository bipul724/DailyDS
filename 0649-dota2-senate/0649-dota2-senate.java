class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();

        int n = senate.length();

        for(int i = 0;i<n;i++){
            char ch = senate.charAt(i);
            if(ch=='R'){
                R.offer(i);
            }
            else{
                D.offer(i);
            }
        }

        while(!R.isEmpty() && !D.isEmpty()){
            int r = R.poll();
            int d = D.poll();

            if(r>d){
                D.offer(d+n);

            }
            else{
                R.offer(r+n);
            }
        }

        return R.isEmpty() ? "Dire" : "Radiant" ;
    }
}