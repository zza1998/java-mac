package com.zza.jianzhiOffer.no15;


import java.util.LinkedList;
import java.util.Queue;

public class Test15 {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(7);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(3);
        a.left=b;
        b.left=c;
        c.left=d;
        d.left=e;
        e.left=f;
        Mirror(a);
        System.out.println(1);
    }

    public static void Mirror(TreeNode root) {
        if (root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode n = queue.poll();
            if (n.left == null && n.right==null){
                continue;
            }
            if (n.left == null){
                n.left = n.right;
                n.right = null;
                queue.offer(n.left);
                continue;
            }
            if (n.right == null){
                n.right = n.left;
                n.left = null;
                queue.offer(n.right);
                continue;
            }
            TreeNode mid = n.left ;
            n.left = n.right;
            n.right = mid;
            queue.offer(n.left);
            queue.offer(n.right);
        }
    }


}
