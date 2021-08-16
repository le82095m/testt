import java.util.ArrayList;

/**
 *
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 * 翻转链表
 *
 * */


class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class JZ3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            return new ArrayList<>();
        }
        ListNode cur = listNode;
        ListNode pre = null;
        ListNode curNext = cur.next;

        while(cur != null){
            curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }

        ArrayList<Integer> list = new ArrayList<>();
        cur = pre;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        return list;
    }
}
