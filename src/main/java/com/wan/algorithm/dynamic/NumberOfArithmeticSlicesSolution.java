package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 413. 等差数列划分
 * 如果一个数列 至少有三个元素 ，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 *
 * 例如，[1,3,5,7,9]、[7,7,7,7] 和 [3,-1,-5,-9] 都是等差数列。
 * 给你一个整数数组 nums ，返回数组 nums 中所有为等差数组的 子数组 个数。
 *
 * 子数组 是数组中的一个连续序列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：3
 * 解释：nums 中有三个子等差数组：[1, 2, 3]、[2, 3, 4] 和 [1,2,3,4] 自身。
 * 示例 2：
 *
 * 输入：nums = [1]
 * 输出：0
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/arithmetic-slices
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/18 18:09
 */
public class NumberOfArithmeticSlicesSolution {
    public static int numberOfArithmeticSlices(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        if(length<3) {
            return 0;
        }

        int result = 0;
        for (int i = 2; i < length; i++) {
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) {
                dp[i] = dp[i-1] + 1;
            }else {
                dp[i] = 0;
            }
            result+=dp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(numberOfArithmeticSlices(array));
    }
}
