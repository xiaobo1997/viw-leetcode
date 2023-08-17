/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    /**
     * 1&1=1  0&1=0 0&0=0
     * 1|1=1  1|0=1 0|0=0
     * 1^1=0  0^1=1 0^0=1
     */
    public int singleNumber(int[] nums) {
        int temp = 0;
        // 0和任何值^ 以后是 他自己， 但是值和值^就是0
        for(int i =0;i<nums.length;i++){
             temp ^= nums[i];
        }
        return temp;
    }
}
// @lc code=end
