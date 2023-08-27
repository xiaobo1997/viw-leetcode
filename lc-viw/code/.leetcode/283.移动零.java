/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null|| nums.length==0) return;
        int i = 0;
        for(int num: nums)
            if(num!=0) nums[i++] = num;
        while(i<nums.length){
            nums[i++] = 0;
        }
    }
}
// @lc code=end


class Solution {
    public void moveZeroes(int[] nums) {

    }
}