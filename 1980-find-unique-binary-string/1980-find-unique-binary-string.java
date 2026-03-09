class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int n = nums.length;

        for(int i=0;i<(1<<n);i++){
            String num = Integer.toString(i,2);
            while(num.length()<n){
                num = "0"+num;
            }
            if(!set.contains(num)){
                return num;
            }
        }
        return "";
    }
}