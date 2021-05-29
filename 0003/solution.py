#https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        if n < 2:
            return n
        head = 0
        tail = 1
        ans = 1
        while tail < n:
            while tail < n and s[tail] not in s[head:tail]:
                tail += 1
            ans = max(ans,tail-head)
            if tail < n:
                head += s[head:tail].index(s[tail])+1
        return ans