class Solution {
    public boolean binarySearch(int x ,  int []nums){
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            mid = (start+end)/2;
            if(x==nums[mid]){
                return true;
            }
            else if(x>nums[mid]){
                start=mid+1;
            }
            else if(x<nums[mid]){
                end = mid-1;
            }

        }
        return false;
        
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (binarySearch(nums2[i], nums1)) {
                set.add(nums2[i]);
            }
        }
        int i = 0;
        int[] arr = new int[set.size()];

        for (int x : set) {
            arr[i] = x;
            i++;
        }

        return arr;

    }
}