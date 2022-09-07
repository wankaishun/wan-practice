package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 152. 乘积最大子数组
 * 152. 乘积最大子数组
 * 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * 示例 2:
 *
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * @date 2021/11/5 11:26
 */
public class MaxProductSolution {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] min = new int[length];
        int[] max = new int[length];

        for (int i = 0; i < nums.length; i++) {
           max[i] = Math.max(max[i-1]*nums[i],Math.max(min[i-1]*nums[i], nums[i]));
           min[i] = Math.min(min[i-1]*nums[i],Math.min(max[i-1]*nums[i], nums[i]));
        }
        return 1;
    }
}
