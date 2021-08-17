package jz;

/**
 *
 * 输入一个链表，反转链表后，输出新链表的表头。
 *
 * */

public class JZ15 {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode curNext = cur.next;
        while(cur != null){
            curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
    }
}
