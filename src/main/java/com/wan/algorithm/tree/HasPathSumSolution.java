package com.wan.algorithm.tree;

/**
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 *
 * 叶子节点 是指没有子节点的节点。
 */
public class HasPathSumSolution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        return check(root, targetSum);
    }
    public boolean check(TreeNode root, int targetSum) {
        Integer result = targetSum;
        if(root != null) {
            result = targetSum - root.val  ;
        }
        if(root == null) {
            return false;
        }
        if((root.left == null && root.right == null && result == 0)) {
            return true;
        }

        return check(root.left, result)||check(root.right, result);
    }
}
