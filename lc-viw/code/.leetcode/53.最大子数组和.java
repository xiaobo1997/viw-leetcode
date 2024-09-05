/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 */
//LeetCode 热题 100
// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE,sum=0;
        for(int i = 0;i<len;i++){
            if(sum>0){
                sum+=nums[i];
            }else{
                sum = nums[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
// @lc code=end

class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum = 0,max = Integer.MAX_VALUE;
        for(int i = 0;i<len;i++){
            if(sum>0){
                sum+=nums[i];
            }else {
                sum = nums[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}