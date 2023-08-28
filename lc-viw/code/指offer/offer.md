<!-- TOC -->

- [1. 剑指 Offer 22. 链表中倒数第 k 个节点](#1-剑指-offer-22-链表中倒数第-k-个节点)

<!-- /TOC -->

# 1. 剑指 Offer 22. 链表中倒数第 k 个节点

输入一个链表，输出该链表中倒数第 k 个节点。为了符合大多数人的习惯，本题从 1 开始计数，即链表的尾节点是倒数第 1 个节点。

例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。

示例：

给定一个链表: 1->2->3->4->5, 和 k = 2.

返回链表 4->5.

```

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        // le在后，cur在前  隔着k个单位距离
        ListNode le=head,cur=head;
        for(int i =0;i<k;i++){
            le = le.next;
        }
        while(le!=null){
            le=le.next;
            cur = cur.next;
        }
        return cur;
    }
}

```
