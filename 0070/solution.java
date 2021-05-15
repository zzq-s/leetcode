//https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int a = 1,b = 2,tmp = 0;
        for(int i=3;i<=n;i++){
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return tmp;
    }
}