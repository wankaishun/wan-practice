package com.wan.algorithm.tree;

import org.w3c.dom.NodeList;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wan
 * @Description: 100.相同的树
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：p = [1,2,3], q = [1,2,3]
 * 输出：true
 * 示例 2：
 *
 *
 * 输入：p = [1,2], q = [1,null,2]
 * 输出：false
 * 示例 3：
 *
 *
 * 输入：p = [1,2,1], q = [1,1,2]
 * 输出：false
 *  
 *
 * 提示：
 *
 * 两棵树上的节点数目都在范围 [0, 100] 内
 * -104 <= Node.val <= 104
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/same-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/15 10:42
 */
public class IsSameTreeSolution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q == null) {
//            return true;
//        }else if(p == null || q == null) {
//            return false;
//        }else if(p.val != q.val) {
//            return false;
//        }else {
//            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(p);
        queue.offer(q);
        while(!queue.isEmpty()) {
              p = queue.poll();
              q = queue.poll();
            if(p == null && q == null) {
                continue;
            }
            if((p == null || q == null) || p.val!=q.val) {
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.left);
            queue.offer(p.right);
            queue.offer(q.right);
        }
        return true;
    }
    // 123 123
    public static void main(String[] args) {
       TreeNode node1 = new TreeNode(1);
        TreeNode node1l = new TreeNode(2);
        TreeNode node1r = new TreeNode(3);
        node1.left = node1l;
        node1.right = node1r;
        TreeNode node2 = new TreeNode(1);
        TreeNode node2l = new TreeNode(2);
        TreeNode node2r = new TreeNode(3);
        node2.left = node2l;
        node2.right = node2r;
        System.out.println(isSameTree(node1,node2));
    }

}
