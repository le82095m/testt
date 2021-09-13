class Node{
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class Test3{
    public static void main(String[] args) {

    }
    public static Node reorderList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node cur1 = head;
        Node mid = FindMiddleNode(head);
        Node cur2 = ReverseList(mid);
        Node temp = null;

        while (cur1.next != null){
            temp = cur1.next;
            cur1.next = cur2;
            cur1 = temp;

            temp = cur2.next;
            cur2.next = cur1;
            cur2 = temp;
        }
        cur1.next = cur2;
        return head;
    }

    private static Node ReverseList(Node head) {
        if(head == null){
            return head;
        }

        Node cur = head;
        Node curNext = head.next;
        Node pre = null;
        while(cur != null){
            curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur =curNext;
        }
        return pre;
    }

    private static Node FindMiddleNode(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node fast = head;
        Node slow = head;
        Node slowPre = null;
        while (fast != null && fast.next != null){
            slowPre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        slowPre.next = null;
        return slow;
    }
}