package com.wan.algorithm.tree;

import java.util.LinkedList;

/**
 * @author wan
 * @Description: 226. 翻转二叉树
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 *
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 * 通过次数298,771提交次数379,410
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/16 15:20
 */
public class InvertTreeSolution {
//    public static TreeNode invertTree(TreeNode root) {
//        if(root == null) {
//            return null;
//        }
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//        root.left = right;
//        root.right = left;
//        return root;
//    }
    public static TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> linkedList = new LinkedList();
        linkedList.offer(root);
        if(root == null) {
            return null;
        }
        while(!linkedList.isEmpty()) {
            TreeNode node = linkedList.poll();
            if(node.left == null && node.right == null) {
                continue;
            }
            TreeNode left = node.left;
            TreeNode right = node.right;
            node.right = left;
            if(left != null) {
                linkedList.offer(left);
            }
            node.left = right;
            if(right != null) {
                linkedList.offer(right);
            }


        }
         return root;
    }

    public static void main(String[] args) {

    }
}

