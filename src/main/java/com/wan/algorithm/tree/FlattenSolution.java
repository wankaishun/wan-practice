package com.wan.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan
 * @Description: 114. 二叉树展开为链表
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,5,3,4,null,6]
 * 输出：[1,null,2,null,3,null,4,null,5,null,6]
 * 示例 2：
 *
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：root = [0]
 * 输出：[0]
 *  
 *
 * 提示：
 *
 * 树中结点数在范围 [0, 2000] 内
 * -100 <= Node.val <= 100
 *  
 *
 * 进阶：你可以使用原地算法（O(1) 额外空间）展开这棵树吗？
 *
 * 通过次数174,025提交次数239,889
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/16 10:15
 */
public class FlattenSolution {
    public static void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorderTraversal(root, list);
        TreeNode pre = null;
        for (int i = 1; i < list.size(); i++) {
            pre = list.get(i-1);
            pre.right = list.get(i);
            pre.left = null;
        }
    }
    public static void preorderTraversal(TreeNode root, List<TreeNode> list) {
        if(root == null) {
            return;
        }
        list.add(root);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);

    }
    public static void main(String[] args) {

    }
}
