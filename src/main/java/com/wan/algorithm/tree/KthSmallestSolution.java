package com.wan.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan
 * @Description: 230. 二叉搜索树中第K小的元素
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [3,1,4,null,2], k = 1
 * 输出：1
 * 示例 2：
 *
 *
 * 输入：root = [5,3,6,2,4,null,null,1], k = 3
 * 输出：3
 *  
 *
 *  
 *
 * 提示：
 *
 * 树中的节点数为 n 。
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 *  
 *
 * 进阶：如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化算法？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/kth-smallest-element-in-a-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/7/18 17:06
 */
public class KthSmallestSolution {
    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        kth(root, list);
        return list.get(k-1);
    }
    public static void kth(TreeNode root, List list) {
        if(root == null) {
            return;
        }
        kth(root.left, list);
        int val = root.val;
        list.add(val);
        kth(root.right, list);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(4);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(2);
        root.left =root1;
        root.right = root2;
        root1.right = root4;
        System.out.println(kthSmallest(root, 2));
    }
}
