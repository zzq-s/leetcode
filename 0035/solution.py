class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums)  # 采用左闭右开区间[left,right)
        while left < right:  # 右开所以不能有=,区间不存在
            pivot = left + (right - left) // 2
            if nums[pivot] == target:
                return pivot
            elif nums[pivot] < target:
                left = pivot + 1  # 左闭,所以要+1
            else:
                right = pivot  # 右开,真正右端点为mid-1
        return left
