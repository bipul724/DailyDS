class Solution {
    public int bitwiseComplement(int n) {
        int num = (int)(Math.log(n)/Math.log(2))+1;

        int mask = (1<<num)-1;

        int complement = mask^n;

        return complement;
    }
}