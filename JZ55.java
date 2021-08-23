package jz;

public class JZ55 {
/**
 *
 * 输入分为2段，第一段是入环前的链表部分，第二段是链表环的部分，
 * 后台将这2个会组装成一个有环或者无环单链表
 * 返回链表的环的入口结点即可。
 *
 * */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead.next == null || pHead.next.next == null){
            return null;
        }
        ListNode quick = pHead;
        ListNode slow = pHead;
        while(slow != null && quick.next != null){
            slow = slow.next;
            quick = quick.next.next;
            if(slow == quick){
                break;
            }
        }

        if(slow == null || quick.next == null){
            return null;
        }

        slow = pHead;
        while(slow != quick){
            slow = slow.next;
            quick = quick.next;
        }
        return slow;
    }
}
