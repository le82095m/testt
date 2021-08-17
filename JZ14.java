package jz;

public class JZ14 {

    /**
     *
     * 输入一个链表，输出一个链表
     * 该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点
     * 如果该链表长度小于k，请返回一个长度为 0 的链表
     *
     * */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        ListNode cur = pHead;
        while(k > 0 && cur != null){
            cur = cur.next;
            k--;
        }
        if(cur == null && k > 0){
            return null;
        }
        ListNode res = pHead;
        while(cur != null){
            cur = cur.next;
            res = res.next;
        }
        return res;
    }
}
