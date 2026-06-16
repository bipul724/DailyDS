class Solution {
    public void twoSum(int nums[], List<List<Integer>> list, int target, int i, int j) {
        while (i < j) {
            int sum = nums[i] + nums[j] + target;
            if (sum == 0) {
                list.add(Arrays.asList(nums[i], nums[j], target));
                i++;
                j--;
                while (i < j && nums[i] == nums[i - 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j + 1]) {
                    j--;
                }
            }

            if (sum > 0) {
                j--;
            } else if (sum < 0) {
                i++;
            }
        }

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 3) {
            return list;
        }

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, list, nums[i], i + 1, n - 1);
        }

        return list;
    }
}