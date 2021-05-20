#https://leetcode.com/problems/contains-duplicate/

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashtable = dict()
        for i in nums:
            if hashtable.get(i):
                return True
            else:
                hashtable[i] = 1
        return False