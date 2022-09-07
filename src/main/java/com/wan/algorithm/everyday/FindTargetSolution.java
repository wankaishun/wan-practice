package com.wan.algorithm.everyday;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wan
 * @Description: 653. 两数之和 IV - 输入 BST
 * 给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入: root = [5,3,6,2,4,null,7], k = 9
 * 输出: true
 * 示例 2：
 *
 *
 * 输入: root = [5,3,6,2,4,null,7], k = 28
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/21 10:48
 */
public class FindTargetSolution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();

        return a(root, k, set);
    }
    public boolean a(TreeNode root, int k, Set<Integer> set){
        if(root == null) {
            return false;
        }
        int b = k - root.val;
        if(set.contains(b)) {
            return true;
        }else{
            set.add(root.val);
        }
       return a(root.left, k, set)||a(root.right, k ,set);
    }
}
