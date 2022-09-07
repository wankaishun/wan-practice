package com.wan.algorithm.tree;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *  
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * 3 2 1 2 3
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *    3 2 4 1 4 2 3
 */
public class IsSymmetricSolution {
   /* public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return check(root.left, root.right);
    }
    public boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return p.val == q.val&&check(p.left, q.right) && check(p.right, q.left);
    }*/

    //使用队列迭代
    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        queue.offer(root);
//        while(!queue.isEmpty()) {
//            int size = queue.size();
//                TreeNode node1 = queue.poll();
//                TreeNode node2 = queue.poll();
//
//                if(node1 == null && node2 == null){
//                    continue;
//                }
//                if((node1 == null || node2 == null) || node1.val != node2.val){
//                    return false;
//                }
//                queue.offer(node1.left);
//                queue.offer(node2.right);
//                queue.offer(node1.right);
//                queue.offer(node2.left);
//            }
//
//        return true;
        if(root == null) {
            return true;
        }
        return check(root, root);

    }
    public boolean check(TreeNode left, TreeNode right) {
        if(left != null && right != null && left.val != right.val) {
            return false;
        }
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right==null) {
            return false;
        }
        return check(left.left, right.right)&& check(left.right, right.left);

    }

}
