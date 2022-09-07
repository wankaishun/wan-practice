package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 300. 最长递增子序列
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 *
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 *  
 * 示例 1：
 *
 * 输入：nums = [10,9,2,5,3,7,101,18]
 * 输出：4
 * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
 * 示例 2：
 *
 * 输入：nums = [0,1,0,3,2,3]
 * 输出：4
 * 示例 3：
 *
 * 输入：nums = [7,7,7,7,7,7,7]
 * 输出：1
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/12 15:33
 */
public class LengthOfLISSolution {
    public static int lengthOfLIS(int[] nums) {
        int[] f = new int[nums.length+1];
        if(nums.length == 1) {
            return 1;
        }
        f[1] = 1;
        int result = 0;
        for (int i = 2; i <= nums.length; i++) {
            int max = 0;
            for (int j = 1; j < i; j++) {
                if(nums[j-1]<nums[i-1]) {
                    max = Math.max(max, f[j]);
                }
            }
            f[i] = max+1;
            result = Math.max(result, max +1);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = {7};
        System.out.println(lengthOfLIS(nums));
    }
}