package jz;

import java.util.LinkedHashMap;
import java.util.Map;

public class JZ56 {
    /**
     *
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
     * 重复的结点不保留，返回链表头指针。
     * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     *
     * */
    public ListNode deleteDuplication(ListNode pHead) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        ListNode cur = pHead;
        while(cur != null){
            int count = map.getOrDefault(cur.val,0);
            map.put(cur.val,++count);
            cur = cur.next;
        }

        ListNode newHead = new ListNode(-1);
        cur = newHead;
        for(int a : map.keySet()){
            if(map.get(a) == 1){
                cur.next = new ListNode(a);
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}
