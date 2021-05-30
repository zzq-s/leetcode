//https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int head = 0,sum=0,ans = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(sum >= target){
                ans = Math.min(ans,i-head+1);
                sum -= nums[head];
                head += 1;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}