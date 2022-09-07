package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description:
 * 给定一个二叉树的 root ，返回 最长的路径的长度 ，这个路径中的 每个节点具有相同值 。
 * 这条路径可以经过也可以不经过根节点。
 *
 * 两个节点之间的路径长度 由它们之间的边数表示。
 *
 *  
 *
 * 示例 1:
 *
 *
 *
 * 输入：root = [5,4,5,1,1,5]
 * 输出：2
 * 示例 2:
 *
 *
 *
 * 输入：root = [1,4,5,4,4,5]
 * 输出：2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-univalue-path
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/9/2 14:43
 */
public class LongestUnivaluePathSolution {
    int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        depth(root);
        return res;
    }

    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        int l = 0;
        int r = 0;
        if(root.left != null && root.left.val == root.val) {
            l = left + 1;
        }
        if(root.right != null && root.right.val == root.val) {
            r = right + 1;
        }
        res = Math.max(res, l + r);
        return Math.max(l, r);
    }
}
