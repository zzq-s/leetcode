#https://leetcode.com/problems/valid-parentheses/

class Solution:
    def isValid(self, s: str) -> bool:
        hashtable = {")":"(","]":"[","}":"{"}
        stack = []
        
        for i in s:
            if stack and i in hashtable:
                if stack[-1] == hashtable[i]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        return not stack