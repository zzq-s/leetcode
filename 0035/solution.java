class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < target) {
                left = pivot + 1;
            } else {
                right = pivot;
            }
        }
        return left;
    }
}