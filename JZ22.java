package jz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ22 {
    /**
     *
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     *
     * */

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            list.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }

        }
        return list;
    }
}
