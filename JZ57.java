package jz;

import java.util.ArrayList;
import java.util.List;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class JZ57 {

    /**
     *
     * 给定一个二叉树其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
     * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的next指针。
     * 下图为一棵有9个节点的二叉树。
     * 树中从父节点指向子节点的指针用实线表示，从子节点指向父节点的用虚线表示
     *
     * */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode root = pNode;
        while(root.next != null){
            root = root.next;
        }
        List<TreeLinkNode> list = inOrder(root);
        int index = list.indexOf(pNode)+1;
        if(index == list.size()){
            return null;
        }
        return list.get(index);
    }

    public List<TreeLinkNode> inOrder(TreeLinkNode root){
        List<TreeLinkNode> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.addAll(inOrder(root.left));
        list.add(root);
        list.addAll(inOrder(root.right));
        return list;
    }
}
