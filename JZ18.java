package jz;

public class JZ18 {
    /**
     *
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     * 比如：    源二叉树
     *             8
     *            /  \
     *           6   10
     *          / \  / \
     *         5  7 9 11
     *         镜像二叉树
     *             8
     *            /  \
     *           10   6
     *          / \  / \
     *         11 9 7  5
     *
     * */

    public TreeNode Mirror (TreeNode pRoot) {
        if(pRoot == null){
            return null;
        }
        TreeNode temp = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = temp;

        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
