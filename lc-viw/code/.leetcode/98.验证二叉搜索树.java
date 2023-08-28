/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long pre = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
            if(root==null){
                return true;
            }
            if(!isValidBST(root.left)){
                return false;
            }
            if(root.val<=pre) return false;
            pre =root.val;
            return isValidBST(root.right);
    }
}
// @lc code=end

class Solution {
    public boolean isValidBST(TreeNode root) {
        
    }
}