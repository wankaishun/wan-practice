package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 分割等和字串
 * 给定一个非空的正整数数组 nums ，请判断能否将这些数字分成元素和相等的两部分。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：nums 可以分割成 [1, 5, 5] 和 [11] 。
 * 示例 2：
 *
 * 输入：nums = [1,2,3,5]
 * 输出：false
 * 解释：nums 不可以分为和相等的两部分
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/NUPfPr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。·
 * @date 2021/8/12 13:35
 */
public class CanPartitionSolution {
    public static boolean canPartition(int[] nums) {
        int half = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        //不能被2 整除直接返回false
        if(sum%2 != 0) {
            return false;
        }
        //求一半的值
        half = sum/2;
        int[] f = new int[half+1];
        for (int i = 1; i < nums.length; i++) {
            f[half]   = f[half-nums[i]] + nums[i];


        }
       return true;

    }

    public static void main(String[] args) {
        int[] a ={1,5,11,5};
        System.out.println(canPartition(a));
    }
}
