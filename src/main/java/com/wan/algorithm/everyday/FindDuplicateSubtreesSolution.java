package com.wan.algorithm.everyday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author wan
 * @Description:
 * 652. 寻找重复的子树
 * 给定一棵二叉树 root，返回所有重复的子树。
 *
 * 对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
 *
 * 如果两棵树具有相同的结构和相同的结点值，则它们是重复的。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：root = [1,2,3,4,null,2,4,null,null,4]
 * 输出：[[2,4],[4]]
 * 示例 2：
 *
 *
 *
 * 输入：root = [2,1,1]
 * 输出：[[1]]
 * 示例 3：
 *
 *
 *
 * 输入：root = [2,2,2,3,null,3,null]
 * 输出：[[2,3],[3]]
 * @date 2022/9/5 9:05
 */
public class FindDuplicateSubtreesSolution {
    private static List<Integer> values = new ArrayList();
    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, TreeNode> map = new HashMap<>();
        List<TreeNode> list = new ArrayList<>();
        deep(root, map, list);
        return list;
    }
    public static String deep (TreeNode root, Map<String, TreeNode> map, List<TreeNode> list) {
        StringBuilder sb = new StringBuilder();
        if(root == null) {
            return "";
        }

        sb.append(root.val);
        sb.append("(");
        sb.append(deep(root.left, map, list));
        sb.append(")");
        sb.append("(");
        sb.append(deep(root.right, map, list));
        sb.append(")");

        if(map.get(sb.toString()) != null && !values.contains(root.val)) {
            list.add(root);
            values.add(root.val);
        }else {
            map.put(sb.toString(), root);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(0);
        TreeNode t2 = new TreeNode(0);
        TreeNode t3 = new TreeNode(0);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(0);
        TreeNode t6 = new TreeNode(0);
        TreeNode t7 = new TreeNode(4);
        t1.left = t2;
        t2.left = t4;
        t1.right = t3;
        t3.right = t5;
        t5.left = t6;
//        t3.right = t6;
//        t5.left = t7;
        List<TreeNode> treeNode = findDuplicateSubtrees(t1);
        for (TreeNode node : treeNode) {
            System.out.println(node.val);
        }
    }
}
