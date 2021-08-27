import java.util.ArrayList;

     class ListNode {
        int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }

public class JZ2_0827 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            return new ArrayList();
        }
        ListNode pre = null;
        ListNode cur = listNode;
        ListNode curNext = listNode.next;

        while(cur != null){
            curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(pre != null){
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }
}
