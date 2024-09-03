/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
//LeetCode 热题 100
class Solution {
    ListNode temp;
    public boolean isPalindrome(ListNode head) {
         temp = head;
         return check(head);
    }

    private boolean check(ListNode head){
        if(head == null) return true;
        boolean res = check(head.next)&&(temp.val==head.val);
        temp = temp.next;
        return res;
    }
}
// @lc code=end


class Solution {
    public boolean isPalindrome(ListNode head) {

    }
}
