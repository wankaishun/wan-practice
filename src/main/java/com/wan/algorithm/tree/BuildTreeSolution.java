package com.wan.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 中序遍历 inorder = [9,3,15,20,7]
 * 后序遍历 postorder = [9,15,7,20,3]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class BuildTreeSolution {
//    HashMap<Integer,Integer> map = new HashMap<>();
//    int[] post;
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        for(int i = 0; i<inorder.length; i++){
//            map.put(inorder[i], i);
//        }
//        post = postorder;
//        return buildTree(0, inorder.length-1, 0, postorder.length-1);
//    }
//   // 中序遍历 + 后续遍历
//    public TreeNode buildTree(int middelStart, int middleEnd, int postStart, int postEnd) {
//        if(middelStart>middleEnd || postStart>postEnd) {
//            return null;
//        }
//        int middel = map.get(post[postEnd]);
//        TreeNode root = new TreeNode(post[postEnd]);
//        root.left = buildTree(middelStart, middel - 1, postStart, postStart+middel-1-middelStart);
//        root.right = buildTree(middel+1, middleEnd, postStart+middel-middelStart, postEnd -1);
//        return root;
//    }

    //中序遍历 + 前序遍历
//    HashMap<Integer,Integer> map = new HashMap<>();
//    int[] post;
//    public TreeNode buildTree(int[] postorder, int[] inorder) {
//        for(int i = 0; i<inorder.length; i++){
//            map.put(inorder[i], i);
//        }
//        post = postorder;
//        return buildTree(0, inorder.length-1, 0, postorder.length-1);
//    }
//    public TreeNode buildTree(int middelStart, int middleEnd, int postStart, int postEnd) {
//        if(middelStart>middleEnd || postStart>postEnd) {
//            return null;
//        }
//        int middel = map.get(post[postStart]);
//        TreeNode root = new TreeNode(post[postStart]);
//        root.left = buildTree(middelStart, middel - 1, postStart + 1, postStart+middel-middelStart);
//        root.right = buildTree(middel+1, middleEnd, postStart+middel-middelStart+1, postEnd);
//        return root;
//    }


    //  3,9,20,15,7 前
    //  9,3,15,20,7 中
//    Map<Integer, Integer> map = new HashMap<>();
//    public TreeNode buildMTree(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
//        if(p_start > p_end) {
//            return null;
//        }
//        TreeNode root = new TreeNode(preorder[p_start]);
//        int inRootIndex = map.get(preorder[p_start]);
//        int leftSize  = inRootIndex - i_start;
//        root.left = buildMTree(preorder, p_start+1, p_start+leftSize, inorder, i_start, inRootIndex-1 );
//        root.right = buildMTree(preorder,p_start+leftSize+1, p_end, inorder, inRootIndex+1, i_end);
//        return root;
//    }
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        for (int i = 0; i < inorder.length; i++) {
//            map.put(inorder[i], i);
//        }
//        return buildMTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
//    }
        //中序遍历+后续遍历

    static Map<Integer, Integer> map = new HashMap<>();
        public static TreeNode buildMTree(int i_start, int i_end, int[] postorder, int p_start, int p_end) {
            if(i_start>i_end || p_start > p_end) {
                return null;
            }
            //根节点
            TreeNode rootTreeNode = new TreeNode(postorder[p_end]);
            //中序遍历 根节点索引
            int inRootIndex = map.get(postorder[p_end]);
            int leftSize = inRootIndex - i_start;
            rootTreeNode.left = buildMTree(  i_start, inRootIndex-1, postorder, p_start, p_start+leftSize-1);
            rootTreeNode.right = buildMTree(  inRootIndex+1, i_end, postorder, p_start+leftSize, p_end-1);
            return rootTreeNode;
        }
        public static TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
            //
        }
        return buildMTree( 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public static void main(String[] args) {
        int[] postorder = {9,15,7,20,3};
        int [] inorder = {9,3,15,20,7};
        System.out.println(buildTree(inorder, postorder));
    }
}
