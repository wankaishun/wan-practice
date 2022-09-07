package com.wan.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wan
 * @Description: 111. 二叉树的最小深度
 * @date 2021/9/15 17:00
 */
public class MinDepthSolution {
    public static int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int a = 0;
        if(root.right != null) {
             a = Math.min(min, minDepth(root.right));
        }
        if(root.left != null) {
            a = Math.min(min, minDepth(root.left));
        }
        return a+1;
    }


    public static void main(String[] args) {
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode2.right = treeNode3;
        treeNode3.right = treeNode4;
        treeNode4.right = treeNode5;
        treeNode5.right = treeNode6;
        System.out.println(minDepth(treeNode2));
    }
}
