package com.wan.algorithm.tree;

import com.sun.deploy.panel.TreeEditors;

/**
 * @author wan
 * @Description: 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 * 示例 2:
 *
 * 输入:
 *     5
 *    / \
 *   4   7
 *      / \
 *     6   8
 * 输出: false
 * 解释: 输入为: [5,4,6,null,null,3,7]。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn08xg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/26 10:51
 */
public class IsValidBSTSolution {

//    public boolean isValidBST(TreeNode root) {
//        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
//        if (root == null)
//            return true;
//        //每个节点如果超过这个范围，直接返回false
//        if (root.val >= maxVal || root.val <= minVal)
//            return false;
//        //这里再分别以左右两个子节点分别判断，
//        //左子树范围的最小值是minVal，最大值是当前节点的值，也就是root的值，因为左子树的值要比当前节点小
//        //右子数范围的最大值是maxVal，最小值是当前节点的值，也就是root的值，因为右子树的值要比当前节点大
//        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
//    }

//    public boolean isValidBST(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        middle( root,   list);
//        for (int i = 1; i < list.size(); i++) {
//            if(list.get(i-1)>=list.get(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public void middle(TreeNode root, List list) {
//        if(root == null) {
//            return;
//        }
//        middle(root.left, list);
//        list.add(root.val);
//        middle(root.right, list);
//    }

    public boolean isValidLeft(TreeNode root, long max){
        if(root == null) {
            return true;
        }
        if(root.val>=max) {
            return false;
        }
        return isValidLeft(root.left, root.val)&&isValidRight(root.right, root.val);
    }
    public boolean isValidRight(TreeNode root, long min) {

        if(root == null) {
            return true;
        }
        if(root.val <= min) {
            return false;
        }
        return isValidRight(root.right, root.val)&&isValidLeft(root.left, root.val);
    }
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return isValidLeft(root.left, root.val)&&isValidRight(root.right, root.val);
    }
}
