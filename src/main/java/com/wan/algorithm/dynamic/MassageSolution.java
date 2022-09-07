package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 按摩师
 * 一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
 *
 * 注意：本题相对原题稍作改动
 *
 *  
 *
 * 示例 1：
 *
 * 输入： [1,2,3,1]
 * 输出： 4
 * 解释： 选择 1 号预约和 3 号预约，总时长 = 1 + 3 = 4。
 * 示例 2：
 *
 * 输入： [2,7,9,3,1]
 * 输出： 12
 * 解释： 选择 1 号预约、 3 号预约和 5 号预约，总时长 = 2 + 9 + 1 = 12。
 * 示例 3：
 *
 * 输入： [2,1,4,5,3,1,1,3]
 * 输出： 12
 * 解释： 选择 1 号预约、 3 号预约、 5 号预约和 8 号预约，总时长 = 2 + 4 + 3 + 3 = 12。
 * 通过次数58,899提交次数113,229
 * 请问您在哪类招聘中遇到此题？
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/the-masseuse-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/10 16:15
 */
public class MassageSolution {
    public static  int massage(int[] nums) {
        int [] amount = new int[nums.length];
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        amount[0] = nums[0];
        amount[1] = Math.max(nums[0], nums[1]);
        amount[2] = Math.max(nums[1], nums[0]+ nums[2]);
        for (int i = 3; i < nums.length; i++) {
            amount[i] = Math.max(amount[i-2]+nums[i], amount[i-3]+nums[i-1]);
        }
        return amount[nums.length -1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1 };
        System.out.println(massage(nums));
    }
}
