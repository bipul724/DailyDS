class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder() ;

        for(int i=0;i<nums.length;i++){
            char ch = nums[i].charAt(i);
            if(ch=='1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }

        return sb.toString();
    }
}