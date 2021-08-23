package jz;

public class JZ58_2 {
    /**
     *
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     *
     * 例如输入：
     *
     *      4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     * 镜像输出：
     *
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     *
     * */
    public TreeNode mirrorTree(TreeNode root) {
        mirror(root);
        return root;
    }
    public static void mirror(TreeNode root){
        if(root == null){
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null){
            mirror(root.left);
        }
        if(root.right != null){
            mirror(root.right);
        }
    }
}
