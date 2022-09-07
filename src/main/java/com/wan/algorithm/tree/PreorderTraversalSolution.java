package com.wan.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回二叉树的前序遍历
 */
public class PreorderTraversalSolution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        preorder(root, list);
        return list;
    }
    public void preorder( TreeNode  root, List<Integer> list){
        if(root == null) {
            return;
        }
        preorder(root.left, list);
        preorder(root.right, list);
        list.add(root.val);
    }
}
