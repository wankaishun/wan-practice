package com.wan.algorithm.tree;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 */
public class LowestCommonAncestorSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }
    public boolean checkP(TreeNode root, int p) {
        if(root == null) {
            return false;
        }
        int val = root.val;
        if(val == p ) {
            return true;
        }
        return checkP(root.left, p) || checkP(root.right, p);

    }
    public boolean checkQ(TreeNode root, int q) {
        if(root == null) {
            return false;
        }
        int val = root.val;
        if(val ==  q) {
            return true;
        }
       return checkQ(root.left, q) || checkQ(root.right, q);

    }
}
