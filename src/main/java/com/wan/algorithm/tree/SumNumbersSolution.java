package com.wan.algorithm.tree;

/**
 * @author wan
 * @Description:
 * 129. 求根节点到叶节点数字之和
 * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
 * 每条从根节点到叶节点的路径都代表一个数字：
 *
 * 例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
 * 计算从根节点到叶节点生成的 所有数字之和 。
 *
 * 叶节点 是指没有子节点的节点。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,3]
 * 输出：25
 * 解释：
 * 从根到叶子节点路径 1->2 代表数字 12
 * 从根到叶子节点路径 1->3 代表数字 13
 * 因此，数字总和 = 12 + 13 = 25
 * 示例 2：
 *
 *
 * 输入：root = [4,9,0,5,1]
 *         4
 *       9   0
 *     5  1
 * 输出：1026
 * 解释：
 * 从根到叶子节点路径 4->9->5 代表数字 495
 * 从根到叶子节点路径 4->9->1 代表数字 491
 * 从根到叶子节点路径 4->0 代表数字 40
 * 因此，数字总和 = 495 + 491 + 40 = 1026
 * @date 2022/7/14 16:43
 */
public class SumNumbersSolution {
    public static int sumNumbers(TreeNode root) {
        if(root.left == null && root.right == null) {
            return root.val;
        }
        return sum(root, 0);
    }
    public  static int sum(TreeNode root, int sum) {
        if(root!=null) {
            sum =  sum*10+root.val;
        }
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return sum;
        }

        return sum(root.left, sum) + sum(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(0);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(1);
        root.left =root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        System.out.println(sumNumbers(root));

    }
}
