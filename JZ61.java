package jz;

import java.util.ArrayList;

public class JZ61 {
    /**
     *
     * 给定一棵二叉搜索树，请找出其中的第k小的TreeNode结点。、
     *
     * */

    TreeNode KthNode(TreeNode pRoot, int k) {
        ArrayList<TreeNode> list = inOrder(pRoot);
        if(k <= 0 || k > list.size()){
            return null;
        }
        return list.get(k-1);
    }

    public static ArrayList<TreeNode> inOrder(TreeNode root){
        ArrayList<TreeNode> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        list.addAll(inOrder(root.left));
        list.add(root);
        list.addAll(inOrder(root.right));

        return list;
    }
}
