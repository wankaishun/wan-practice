package com.wan.algorithm.everyday;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wan
 * @Description: 515. 在每个树行中找最大值
 * 给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
 *
 *  
 *
 * 示例1：
 *
 *
 *
 * 输入: root = [1,3,2,5,3,null,9]
 * 输出: [1,3,9]
 * 示例2：
 *
 * 输入: root = [1,2,3]
 * 输出: [1,3]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-largest-value-in-each-tree-row
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/6/24 10:05
 */
public class LargestValuesSolution {

    public List<Integer> largestValues(TreeNode root) {
    // 广度优先
//
//        Deque<TreeNode> deque = new LinkedList();
//        List<Integer> list = new ArrayList<>();
//        if(root == null) {
//            return list;
//        }
//        deque.offerLast(root);
//        while(!deque.isEmpty()) {
//            int length = deque.size();
//            int max = deque.peekLast().val;
//            for (int i = 0; i < length; i++) {
//                TreeNode treeNode = deque.pollFirst();
//                if(treeNode.val> max) {
//                    max = treeNode.val;
//                }
//                if(treeNode.left != null) {
//                    deque.offerLast(treeNode.left);
//                }
//                if(treeNode.right!= null) {
//                    deque.offerLast(treeNode.right);
//                }
//            }
//            list.add(max);
//        }
//        return list;

        return null;
    }

    public static void main(String[] args) {

    }
}
