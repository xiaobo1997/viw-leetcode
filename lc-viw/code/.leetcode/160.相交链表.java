/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //    1->3-4
    // 1->2->3-4
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null; 
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = a==null?headB:a.next;
            b = b == null?headA:b.next;
        }
        return a;
    }
}
// @lc code=end
class A{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null){
        return null;
       }
       ListNode a = headA;
       ListNode b = headB;
       while(a!=b){
            a= a==null?headB:a.next;
            b = b==null?headA:b.next;
       }
       return a;
    }    
}
