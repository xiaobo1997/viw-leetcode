import java.util.*;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        /**
         *   1
         *  2 3
         */
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> resList = new LinkedList();
        if(root == null) return resList;
        queue.add(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList();
            //一层  遍历一次
            for(int i = 0;i<levelNum;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            resList.add(subList);
        }
        return resList;
    }
}
// @lc code=end

class A{

public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList();
       List<List<TreeNode>> resList = new LinkedList;
        queue.add(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> temp = new LinkedList();
            for(int i =0;i<levelNum;i++){
                if(queue.peek().left!=null) queue.add(queue.peek().left);
                if(queue.peek().right!=null) queue.add(queue.peek().right);
                temp.add(queue.poll.val);
            }
            resList.add(temp);

        }



       return resList;
    }


}