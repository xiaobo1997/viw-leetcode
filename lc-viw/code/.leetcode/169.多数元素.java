/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    // public int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     return nums[n/2];
    // }


    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i : nums){
            if(count == 0)  res = i;

            if(i==res) count++;
            else count--;
        }
        return res;
        
    }
}
// @lc code=end
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i : nums){
            if(count == 0) return res = i;

            if(i==res) count++;
            else count --;
        }
        return res;
        
    }
}
