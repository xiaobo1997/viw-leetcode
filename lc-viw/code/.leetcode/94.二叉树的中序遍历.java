import java.util.List;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList();
       dfs(res,root);
       return res;
    }

    private void dfs(List list,TreeNode root){
        if(root==null) return;
        dfs(list,root.left);
        list.add(root.val);
        dfs(list,root.right);
    }
}
// @lc code=end

class A{
  public List<Integer> inorderTraversal(TreeNode root) {
        
    }

}