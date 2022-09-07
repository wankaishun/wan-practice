package com.wan.algorithm.everyday;

import java.util.Arrays;
import java.util.List;

/**
 * @author wan
 * @Description: 324. 摆动排序 II
 * 给你一个整数数组 nums，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序。
 *
 * 你可以假设所有输入数组都可以得到满足题目要求的结果。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,5,1,1,6,4]
 * 输出：[1,6,1,5,1,4]
 * 解释：[1,4,1,5,1,6] 同样是符合题目要求的结果，可以被判题程序接受。
 * 示例 2：
 *
 * 输入：nums = [1,3,2,2,3,1]
 * 输出：[2,3,1,3,1,2]
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/wiggle-sort-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/6/28 10:06
 */
public class WiggleSortSolution {
    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] copy = Arrays.copyOf(nums, nums.length);
        int offset = nums.length%2 == 0?nums.length/2-1:nums.length/2;
        for (int i = 0, j=0; i < nums.length; i++) {
            if(i%2 == 0) {
                nums[i] = copy[j];
                j++;
            }
            if(i%2 == 1) {
                nums[i] = copy[nums.length - j];
            }
        //    1 6 2 7 3 8 4 9 5
        }
    }

    public static void main(String[] args) {
        // 1 1 2 2 3 3

        int[] nums = {1,3,2,2,3,1};
        wiggleSort(nums);
        for (int num : nums) {
            System.out.print(" ");
            System.out.print(num);
        }
    }
}
