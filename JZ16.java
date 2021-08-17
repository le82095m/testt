package jz;

public class JZ16 {

    /**
     *
     * 输入两个单调递增的链表，输出两个链表合成后的链表，
     * 当然我们需要合成后的链表满足单调不减规则。
     *
     * */

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newList = new ListNode(0);
        ListNode cur = newList;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                cur.next = new ListNode(cur1.val);
                cur1 = cur1.next;
            }else{
                cur.next = new ListNode(cur2.val);
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if(cur1 != null){
            cur.next = cur1;
            cur = cur.next;
        }
        if(cur2 != null){
            cur.next = cur2;
            cur = cur.next;
        }
        return newList.next;
    }
}
