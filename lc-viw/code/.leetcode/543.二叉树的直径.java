/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return res;
    }

    private int height(TreeNode root) {
        if(root==null) return -1;
        int l = height(root.left);
        int r = height(root.right);
        res = Math.max(res,l+r+2);
        return Math.max(l,r)+1;
    }
}
// @lc code=end

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

    }
}