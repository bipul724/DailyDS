class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        events.sort(
            Comparator.comparingInt((List<String> e) -> Integer.parseInt(e.get(1)))
                      .thenComparingInt(e->e.get(0).equals("OFFLINE")?0:1)
        );
        int count = 0;
        int all = 0;
        int []mentions = new int[numberOfUsers];
        int []nextOnline = new int[numberOfUsers];
        
        
        for(List<String> event : events){
            int currTime = Integer.parseInt(event.get(1));
            
            
            if(event.get(0).equals("MESSAGE")){
                String target = event.get(2);
                String[] tokens = target.split(" ");
                for(String token : tokens){
                    if(token.equals("ALL")){
                        all++;
                    }
                    else if(token.equals("HERE")){
                        for(int i=0;i<numberOfUsers;i++){
                            if(nextOnline[i]<=currTime){
                                mentions[i]++;
                            }
                        }
                    }
                    else if(token.startsWith("id")){
                        int idx = Integer.parseInt(token.substring(2));
                        mentions[idx]++;

                    }
                }
            }
            else{
                int idx = Integer.parseInt(event.get(2));
                nextOnline[idx] = currTime + 60;

                
            }
        }

        if (all != 0) {
            for (int i = 0; i < numberOfUsers; i++){ 
                mentions[i] += all;
            };
        }
        return mentions;
    }
}