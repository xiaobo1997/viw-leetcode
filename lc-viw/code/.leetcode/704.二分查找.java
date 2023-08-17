/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        // 0 1 2 3   4/2=2 5/2=2
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = (left+right)>>1;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }
        }
        return -1;
    }
}
// @lc code=end

