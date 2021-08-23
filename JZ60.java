package jz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ60 {
    /**
     *
     * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     * 例如：
     * 给定的二叉树是{1,2,3,#,#,4,5}
     *
     * */

    class RodeAdnHigh{
        TreeNode node;
        int high;

        public RodeAdnHigh(TreeNode node,int high){
            this.node = node;
            this.high = high;
        }
    }
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        Queue<RodeAdnHigh> queue = new LinkedList<>();
        queue.add(new RodeAdnHigh(pRoot,0));
        while(!queue.isEmpty()){
            RodeAdnHigh nah = queue.remove();
            if(nah.high == arrayLists.size()){
                arrayLists.add(new ArrayList<>());
            }
            arrayLists.get(nah.high).add(nah.node.val);

            if(nah.node.left != null){
                queue.add(new RodeAdnHigh(nah.node.left,nah.high+1));
            }

            if(nah.node.right != null){
                queue.add(new RodeAdnHigh(nah.node.right,nah.high+1));
            }
        }

        return arrayLists;
    }
}
