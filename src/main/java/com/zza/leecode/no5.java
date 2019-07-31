package com.zza.leecode;

import java.util.LinkedList;
import java.util.Queue;

public class no5 {

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        node.left=left;
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(4);
        node.left.right=new TreeNode(5);

        System.out.println(run(node));
    }
    private static int run (TreeNode node){
        if(node==null){
            return 0;
        }
        if (node.left==null&&node.right==null){
            return 1;
        }

        int depth=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            int len=queue.size();
                depth++;
            for (int i = 0;i<len;i++){
                TreeNode treeNode=queue.poll();

                if (treeNode.left==null&&treeNode.right==null){
                    return depth;
                }
                if (treeNode.left!=null){
                    queue.offer(treeNode.left);
                }
                if (treeNode.right!=null){
                    queue.offer(treeNode.right);
                }
            }

        }
        return 0;

    }
}
