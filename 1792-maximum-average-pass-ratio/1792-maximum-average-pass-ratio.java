class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        int n = classes.length;

        for(int i=0;i<n;i++){
            double ratio = (double)(classes[i][0])/classes[i][1];
            double newRatio = (double)(classes[i][0]+1)/(classes[i][1]+1);
            double delta = newRatio - ratio;
            pq.offer(new double[]{delta,i});
        }

        for(int i=0;i<extraStudents;i++){
            double arr[] = pq.poll();
            int idx = (int)arr[1];
            classes[idx][0]++;
            classes[idx][1]++;

            double ratio = (double)(classes[idx][0])/classes[idx][1];
            double newRatio = (double)(classes[idx][0]+1)/(classes[idx][1]+1);
            double delta = newRatio - ratio;

            pq.offer(new double[]{delta,idx});

        }
        
        double sum= 0;

        for(int i=0;i<n;i++){
            double a = (double)(classes[i][0])/classes[i][1];
            sum+=a;
        }

        return (sum/n);

    }
}