package jz;

import java.util.HashMap;
import java.util.Map;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

/**
 *
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）。
 * 下图是一个含有5个结点的复杂链表。图中实线箭头表示next指针，虚线箭头表示random指针。
 * 为简单起见，指向null的指针没有画出。
 *
 * */

public class JZ25 {
    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode node = new RandomListNode(-1);
        RandomListNode nodeCur = node;
        RandomListNode cur = pHead;
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        while(cur != null){
            nodeCur.next = new RandomListNode(cur.label);
            nodeCur = nodeCur.next;
            nodeCur.random = cur.random;
            map.put(cur,nodeCur);
            cur = cur.next;
        }

        nodeCur = node.next;
        while(nodeCur != null){
            nodeCur.random = map.get(nodeCur.random);
            nodeCur = nodeCur.next;
        }

        return node.next;
    }
}
