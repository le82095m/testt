package jz;

public class JZ58 {
    /**
     *
     * 请实现一个函数，用来判断一棵二叉树是不是对称的。
     * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     *
     * */
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null){
            return true;
        }
        return mirror(pRoot.left,pRoot.right);
    }
    public static boolean mirror(TreeNode p ,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return  p.val == q.val && mirror(p.left,q.right) && mirror(p.right,q.left);
    }
}
