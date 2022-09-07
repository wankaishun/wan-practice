package com.wan.algorithm.everyday;



/**
 * @author wan
 * @Description: 437. 路径总和 III
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 *
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 示例 1：
 *
 * 输入：root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * 输出：3
 * 解释：和等于 8 的路径有 3 条，如图所示。
 * 示例 2：
 *
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：3
 *  
 *
 * 提示:
 *
 * 二叉树的节点个数的范围是 [0,1000]
 * -109 <= Node.val <= 109 
 * -1000 <= targetSum <= 1000 
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/28 9:40
 */
public class PathSumSolution {
    public  static int pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return 0;
        }
        int sum = rootSum(root, targetSum);
        sum += pathSum(root.left, targetSum);
        sum += pathSum(root.right, targetSum);
        return sum;
    }

    public static int rootSum (TreeNode root, int targetSum) {
        int sum = 0;
        if(root == null) {
            return 0;
        }
        if(root.val == targetSum) {
            sum ++;
        }
        sum += rootSum(root.left, targetSum -root.val);
        sum += rootSum(root.right, targetSum -root.val);
        return sum;

    }

    public static void main(String[] args) {

    }
}
