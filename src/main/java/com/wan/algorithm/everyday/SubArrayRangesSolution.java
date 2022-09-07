package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 2104. 子数组范围和
 * 给你一个整数数组 nums 。nums 中，子数组的 范围 是子数组中最大元素和最小元素的差值。
 *
 * 返回 nums 中 所有 子数组范围的 和 。
 *
 * 子数组是数组中一个连续 非空 的元素序列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：4
 * 解释：nums 的 6 个子数组如下所示：
 * [1]，范围 = 最大 - 最小 = 1 - 1 = 0
 * [2]，范围 = 2 - 2 = 0
 * [3]，范围 = 3 - 3 = 0
 * [1,2]，范围 = 2 - 1 = 1
 * [2,3]，范围 = 3 - 2 = 1
 * [1,2,3]，范围 = 3 - 1 = 2
 * 所有范围的和是 0 + 0 + 0 + 1 + 1 + 2 = 4
 * 示例 2：
 *
 * 输入：nums = [1,3,3]
 * 输出：4
 * 解释：nums 的 6 个子数组如下所示：
 * [1]，范围 = 最大 - 最小 = 1 - 1 = 0
 * [3]，范围 = 3 - 3 = 0
 * [3]，范围 = 3 - 3 = 0
 * [1,3]，范围 = 3 - 1 = 2
 * [3,3]，范围 = 3 - 3 = 0
 * [1,3,3]，范围 = 3 - 1 = 2
 * 所有范围的和是 0 + 0 + 0 + 2 + 0 + 2 = 4
 * 示例 3：
 *
 * 输入：nums = [4,-2,-3,4,1]
 * 输出：59
 * 解释：nums 中所有子数组范围的和是 59
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-subarray-ranges
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/4 14:00
 */
public class SubArrayRangesSolution {
    public static long subArrayRanges(int[] nums) {
        long[][][] dp = new long[nums.length][nums.length][2];
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i][i][0] = nums[i];
            dp[i][i][1] = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                dp[i][j][0] = dp[i][j-1][0];
                dp[i][j][1] = dp[i][j-1][1];
                if(nums[j]<dp[i][j-1][0]) {
                    dp[i][j][0] = nums[j];

                }else if(nums[j]>dp[i][j-1][1]) {
                    dp[i][j][1] = nums[j] ;
                }
                sum += dp[i][j][1] - dp[i][j][0];

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {4,-2,-3,4,1};
        System.out.println(subArrayRanges(a));
    }
}
