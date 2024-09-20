/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
LeetCode 热题 100
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head,slow = head;
        for(int i =0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
// @lc code=end

class Solution {
    // [1,2,3] n=1  删除3  slow=1 fast=2
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode slow = head,fast = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null) return head;
        while(fast!=null){
            slow= slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;


    }
}
