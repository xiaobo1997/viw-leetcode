/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return is(root.left,root.right);
    }

    private boolean is(TreeNode left,TreeNode right){
        if(left==null||right==null) return left==right;
        if(left.val!=right.val) return false;
        return is(left.left, right.right) &&
        is(left.right, right.left);
    }
}
// @lc code=end


class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        return is(root.left,root.right);
    }

      private boolean is(TreeNode left,TreeNode right){
        if(left==null || right ==null) return left==right;
        if(left.val!=right.val) return false;
        return is(left.left,right.right)&& is(left.right,right.left);
    }
}
