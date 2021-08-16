import java.util.ArrayList;
import java.util.List;

/**
 *
 * 给定某二叉树的前序遍历和中序遍历
 * 请重建出该二叉树并返回它的头结点
 *
 * */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class JZ4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();
        for(int t : pre){
            preList.add(t);
        }
        for(int t : vin){
            inList.add(t);
        }
        return function(preList,inList);
    }

    public static TreeNode function(List<Integer> preList, List<Integer> inList){
        if(preList.isEmpty()){
            return null;
        }

        int val = preList.get(0);
        TreeNode root = new TreeNode(val);
        int preSize = inList.indexOf(val);

        List<Integer> preLeft = preList.subList(1,preSize+1);
        List<Integer> preRight = preList.subList(preSize+1,preList.size());
        List<Integer> inLeft = inList.subList(0,preSize);
        List<Integer> inRight = inList.subList(preSize+1,inList.size());

        root.left = function(preLeft,inLeft);
        root.right = function(preRight,inRight);
        return root;
    }
}
