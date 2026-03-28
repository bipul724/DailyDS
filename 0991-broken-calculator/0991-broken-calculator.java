class Solution {
    public int brokenCalc(int startValue, int target) {
        int count = 0;
        while (startValue != target) {
            if (target > startValue && target % 2 == 0) {
                target = target / 2;
            } else if (target < startValue || target % 2 != 0) {
                target++;
            }
            count++;
        }
        return count;

    }
}