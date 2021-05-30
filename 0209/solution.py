#https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        if sum(nums) < target:
            return 0
        head = 0
        sum_l = 0
        ans = len(nums)
        for i in range(len(nums)):
            sum_l += nums[i]
            while sum_l >= target:
                ans = min(ans,i-head+1)
                sum_l -= nums[head]
                head += 1
        return ans