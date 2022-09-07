package com.wan.algorithm.dynamic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wan
 * @Description: 368. 最大整除子集
 * 给你一个由 无重复 正整数组成的集合 nums ，请你找出并返回其中最大的整除子集 answer ，子集中每一元素对 (answer[i], answer[j]) 都应当满足：
 * answer[i] % answer[j] == 0 ，或
 * answer[j] % answer[i] == 0
 * 如果存在多个有效解子集，返回其中任何一个均可。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[1,2]
 * 解释：[1,3] 也会被视为正确答案。
 * 示例 2：
 *
 * 输入：nums = [1,2,4,8]
 * 输出：[1,2,4,8]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-divisible-subset
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/18 10:42
 */
public class LargestDivisibleSubsetSolution {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        //排序
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int maxsize = 1;
        int maxvalue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(dp[i] >maxsize) {
                maxsize = dp[i];
                maxvalue = nums[i];
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        if (maxsize == 1) {
            res.add(nums[0]);
            return res;
        }
        for (int i = nums.length - 1; i >= 0 && maxsize > 0; i--) {
            if (dp[i] == maxsize && maxvalue % nums[i] == 0) {
                res.add(nums[i]);
                maxvalue = nums[i];
                maxsize--;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] a = {3,4,16,8};
        System.out.println(largestDivisibleSubset(a));
    }
}
