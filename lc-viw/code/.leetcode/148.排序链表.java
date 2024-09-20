/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        ListNode res = head;
        ListNode p = head;
        PriorityQueue<Integer> pq= new PriorityQueue();
        while(p!=null){
            pq.offer(p.val);
            p = p.next;
        }
        p = head;
        while(pq.size()>0){
            p.val = pq.poll();
            p = p.next;
        }
        return res;
    }
}
// @lc code=end

class Solution {
    public ListNode sortList(ListNode head) {

    }
}