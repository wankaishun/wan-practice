package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 540. 有序数组中的单一元素
 * 给你一个仅由整数组成的有序数组，其中每个元素都会出现两次，唯有一个数只会出现一次。
 *
 * 请你找出并返回只出现一次的那个数。
 *
 * 你设计的解决方案必须满足 O(log n) 时间复杂度和 O(1) 空间复杂度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,2,3,3,4,4,8,8]
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums =  [3,3,7,7,10,11,11]
 * 输出: 10
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-element-in-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/2/14 9:21
 */
public class SingleNonDuplicateSolution {
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int i = 0;
        int j = 1;
        while(true) {
            if(i>nums.length-1) {
                return 1;
            }
            if(j>nums.length-1 && i<=nums.length-1) {
                return nums[i];
            }
            if(nums[i] != nums[j]) {
                return nums[i];
            }
            i+=2;
            j+=2;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
