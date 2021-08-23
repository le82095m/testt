package jz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JZ59 {
    /**
     *
     * 给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
     * 例如：
     * 给定的二叉树是{1,2,3,#,#,4,5}
     *
     * */
    private class RootAndHigh{
        TreeNode node;
        int high;

        public RootAndHigh(TreeNode node,int high){
            this.node = node;
            this.high = high;
        }
    }
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if(pRoot == null){
            return arrayLists;
        }
        Queue<RootAndHigh> queue = new LinkedList<>();
        queue.add(new RootAndHigh(pRoot,0));

        while(!queue.isEmpty()){
            RootAndHigh rah = queue.remove();
            if(rah.high == arrayLists.size()){
                arrayLists.add(new ArrayList<>());
            }
            arrayLists.get(rah.high).add(rah.node.val);

            if(rah.node.left != null){
                queue.add(new RootAndHigh(rah.node.left,rah.high+1));
            }

            if(rah.node.right != null){
                queue.add(new RootAndHigh(rah.node.right,rah.high+1));
            }
        }

        for(int i = 0; i < arrayLists.size(); i++){
            if(i % 2 != 0){
                spin(arrayLists.get(i));
            }
        }
        return arrayLists;
    }

    public static void spin(ArrayList<Integer> list){
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            int t = list.get(i);
            list.set(i,list.get(j));
            list.set(j,t);
            i++;
            j--;
        }
    }
}
