class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<int []> ans = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i][0]>nums2[j][0]){
                ans.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }
            else{
                ans.add(new int[]{nums2[j][0],nums2[j][1]+nums1[i][1]});
                i++;
                j++;
            }
        }
        while(i<n){
            ans.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<m){
            ans.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        int arr[][] = new int[ans.size()][2];
        for(int k=0;k<ans.size();k++){
            int x = ans.get(k)[0];
            int y = ans.get(k)[1];
            arr[k][0]=x;
            arr[k][1]=y;

        }
        return arr;
    }
}