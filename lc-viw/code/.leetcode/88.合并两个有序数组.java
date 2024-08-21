import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 *
 *
输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
输出：[1,2,2,3,5,6]
解释：需要合并 [1,2,3] 和 [2,5,6] 。
合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。

 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i =0;i<n;i++){
            nums1[i+m]  = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
// @lc code=end

