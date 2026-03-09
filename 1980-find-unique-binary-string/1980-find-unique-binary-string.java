class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String ans = "" ;

        for(int i=0;i<nums.length;i++){
            char ch = nums[i].charAt(i);
            if(ch=='1'){
                ans+='0';
            }
            else{
                ans+='1';
            }
        }

        return ans;
    }
}