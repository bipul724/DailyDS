class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();

        System.out.println(tasks.length);

        for(int i = 0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }

        int count = 0;


        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int x = m.getValue();
            if(x<2){
                return -1;
            }
            // else if((x)%3==0){
            //     count += x/3;
            // }
            // else if(x%3==2 || x%3==1){
            //     count += (x/3)+1;
            // }
            // else if(x%2==0){
            //     count+=(x/2);
            // }

            count += (x+2)/3;
            
        }
        return count;

    }
}