//https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashtable = new HashSet<Integer>();
        for (int i : nums) {
            if (!hashtable.add(i)) {
                return true;
            }
        }
        return false;
    }
}