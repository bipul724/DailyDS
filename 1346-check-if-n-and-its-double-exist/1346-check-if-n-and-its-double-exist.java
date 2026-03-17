class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);

        for(int i=1;i<arr.length;i++){
            if(set.contains(arr[i]*2) || (arr[i]%2==0 && set.contains((arr[i])/2))){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}