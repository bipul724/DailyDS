class Solution {
    public String[] findRelativeRanks(int[] score) {
        int nums[] = new int[score.length];
        for(int i=0;i<score.length;i++){
            nums[i]=score[i];
        }
        Arrays.sort(score);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<score.length;i++){
            map.put(score[i],score.length-i);
        }

        String arr[] = new String[score.length];

        for(int i=0;i<score.length;i++){
            int x = map.get(nums[i]);
            if(x==1){
                arr[i]="Gold Medal" ;
            }
            else if(x==2){
                arr[i]="Silver Medal";
            }
            else if(x==3){
                arr[i]="Bronze Medal";
            }
            else{
                arr[i] = x+"";
            }
            
        }
        return arr;
    }
}