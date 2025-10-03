class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list = new ArrayList<>();

        int[] current = intervals[0];
        list.add(current);

        for(int i=1;i<intervals.length;i++){
            int []x = intervals[i];
            if(x[0]<=current[1]){
                current[1] = Math.max(current[1], x[1]);
            }
            else{
                current = x;
                list.add(current);
            }
        }

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}