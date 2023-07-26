/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int temp = 0;
        for(int i = 0;i<nums.length;i++){
            temp ^= nums[i];
        }
        return temp;
    }
}
// @lc code=end

