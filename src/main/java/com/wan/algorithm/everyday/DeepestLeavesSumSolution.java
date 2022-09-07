package com.wan.algorithm.everyday;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wan
 * @Description:
 * 1302. 层数最深叶子节点的和
 * 给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * 输出：15
 * 示例 2：
 *
 * 输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * 输出：19
 * @date 2022/8/17 14:24
 */
public class DeepestLeavesSumSolution {
    public static int deepestLeavesSum(TreeNode root) {
        // 广度优先搜索
        Deque<TreeNode> deque = new LinkedList();
        deque.offerLast(root);
        int sum = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = deque.pollFirst();
                if(current.left != null) {
                    deque.offerLast(current.left);
                }
                if(current.right != null) {
                    deque.offerLast(current.right);
                }
                sum += current.val;
            }
        }
        return sum;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(deepestLeavesSum(root));
    }
}
