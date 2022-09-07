package com.wan.algorithm.tree;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层序遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class LevelOrderSolution {
    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();Deque<TreeNode> deque = new LinkedList();
        if(root == null ) {
            return list;
        }
        deque.offerLast(root);
        while(!deque.isEmpty()) {
           List<Integer> subList = new ArrayList<>();
           int length = deque.size();
           for(int i = 0; i<length;i++) {
               TreeNode node = deque.pollFirst();
               subList.add(node.val);
               if(node.left != null) {
                  deque.offerLast(node.left);
               }
               if(node.right != null) {
                  deque.offerLast(node.right);
               }
           }
            list.add(subList);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode l1 = new TreeNode(9);
        TreeNode r1 = new TreeNode(20);
        TreeNode l2 = new TreeNode(15);
        TreeNode r2 = new TreeNode(7);
        root.left = l1;
        root.right = r1;
        r1.left = l2;
        r1.right = r2;
        for (List<Integer> integers : levelOrder(root)) {
            System.out.println();
            integers.forEach(System.out::print);
        }

    }
}
