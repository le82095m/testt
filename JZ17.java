package jz;

import java.util.LinkedList;
import java.util.Queue;

public class JZ17 {
    /**
     *
     * 输入两棵二叉树A，B，判断B是不是A的子结构。
     * （ps：我们约定空树不是任意一个树的子结构）
     *
     * */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root1);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(isSameTree(node,root2)){
                return true;
            }
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return false;
    }
    public static boolean isSameTree(TreeNode root1,TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
}
