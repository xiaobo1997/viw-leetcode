/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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
    private int i = 0;
    private int p = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,Integer.MIN_VALUE);
    }
    private TreeNode build(int[] preorder,int[] inorder,int stop){
        if(p>=preorder.length) return null;
        if(inorder[i]==stop){
            ++i;
            return null;
        }
        TreeNode node = new TreeNode(preorder[p++]);
        node.left = build(preorder,inorder,node.val);
        node.right = build(preorder,inorder,stop);
        return node;

    }
}
// @lc code=end

class Solution {
   
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,Integer.MIN_VALUE);
    }
    private TreeNode build(int[] preorder,int[] inorder,int stop){
    

    }
}