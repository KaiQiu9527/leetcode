package leetcode_206;

/**
 * 反转一个单链表。
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head,null);
    }

    public ListNode helper(ListNode head, ListNode reverseList){
        if (head == null)
            return reverseList;
        ListNode tempTail = new ListNode(head.val);
        tempTail.next = reverseList;
        return helper(head.next,tempTail);

    }
}
