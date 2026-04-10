class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();

        for (int num : banned) {
            set.add(num);
        }

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i) && i<maxSum) {
                sum += i;
                if (sum <= maxSum) {
                    System.out.println(sum + " " + i + " " + count);
                    count++;
                } else {
                    System.out.println(sum + " " + i + " " + count);
                    break;
                }

            }

        }
        return count;
    }
}