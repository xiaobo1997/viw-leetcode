/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return dfs(l1,l2,0);
    }
    ListNode dfs(ListNode l1,ListNode l2, int i){
        if(l1==null&&l2==null&&i==0) return null;
        int sum=(l1!=null?l1.val:0)+(l2!=null?l2.val:0)+i;
        var node = new ListNode(sum%10);
        node.next = dfs(l1!=null?l1.next:null,l2!=null?l2.next:null,sum/10);
        return node;
    }
}
// @lc code=end

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return dfs(l1,l2,0);
    }
    void dfs(ListNode l1,ListNode l2,int i){
       if(l1==null&&l2==null&&i==0) return null;
       int sum = (1l==null?0:l1.val)+(l2==null?0:l2.val)+i;
       var node = new ListNode(sum%10);
       node.next = dfs(l1==null?null:l1.next,l2==null?null:l2.next);
       return node;
    }
}


