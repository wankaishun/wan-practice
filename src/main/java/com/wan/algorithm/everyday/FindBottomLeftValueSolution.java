package com.wan.algorithm.everyday;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wan
 * @Description: 513. 找树左下角的值
 * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
 *
 * 假设二叉树中至少有一个节点。
 *
 * 示例 1:
 *
 * 输入: root = [2,1,3]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [1,2,3,4,null,5,6,null,null,7]
 * 输出: 7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-bottom-left-tree-value
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/6/22 14:31
 */
public class FindBottomLeftValueSolution {
    public static int findBottomLeftValue(TreeNode root) {

        int a = root.val;
        Deque<TreeNode> deque = new LinkedList();
        deque.offerLast(root);
        while(!deque.isEmpty()) {
            TreeNode treeNode = deque.pollFirst();
            if(treeNode.right != null) {
                deque.offerLast(treeNode.right);

            }
            if(treeNode.left != null) {
                deque.offerLast(treeNode.left);
            }
            a = treeNode.val;
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
