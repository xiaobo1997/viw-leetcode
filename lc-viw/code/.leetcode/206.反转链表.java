/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //双指针 让他们交换位置
        ListNode left =null;
        ListNode right=head;
        ListNode temp = null;
        // null-1->2->3  left=null  right=1
        while(right!=null){
            //先记录right的下一个节点2
            temp = right.next;
            
            //right的下一个指向left 也就是第一次的null
            right.next = left;
            //left前进一步
            left  = right;
            //right前进一步
            right = temp;
        }
        return left;
    }
}
// @lc code=end

