package jz;

public class JZ36 {

    /**
     *
     * 输入两个无环的单链表，找出它们的第一个公共结点。
     * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
     *
     * */

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = 0;
        int length2 = 0;
        ListNode cur1 = pHead1;
        ListNode cur2 = pHead2;
        while(cur1 != null){
            length1++;
            cur1 = cur1.next;
        }
        while(cur2 != null){
            length2++;
            cur2 = cur2.next;
        }
        cur1 = pHead1;
        cur2 = pHead2;
        while(length2 > length1){
            cur2 = cur2.next;
            length2--;
        }
        while(length1 > length2){
            cur1 = cur1.next;
            length1--;
        }
        while(cur1 != null){
            if(cur1 == cur2){
                return cur1;
            }else{
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return null;
    }
}
