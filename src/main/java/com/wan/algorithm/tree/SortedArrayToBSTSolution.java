package com.wan.algorithm.tree;

/**
 * @author wan
 * @Description: 将有序数组转为二叉搜索树
 * @date 2021/5/31 20:48
 */
public class SortedArrayToBSTSolution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length ==0) {
            return null;
        }
        int start = 0;
        int end = nums.length-1;
        return generate(nums, start, end);
    }
    public TreeNode generate(int[] nums, int start, int end){
        if(start > end) {
            return null;
        }
        int index = (int)Math.ceil((end-start)/2+start);
        TreeNode treeNode = new TreeNode(nums[index]);
        treeNode.left = generate(nums, start, index-1);
        treeNode.right = generate(nums, index+1, end);
        return  treeNode;
    }
}
