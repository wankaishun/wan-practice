package com.wan.algorithm.everyday;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wan
 * @Description: 219. 存在重复元素 II
 * 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1], k = 3
 * 输出：true
 * 示例 2：
 *
 * 输入：nums = [1,0,1,1], k = 1
 * 输出：true
 * 示例 3：
 *
 * 输入：nums = [1,2,3,1,2,3], k = 2
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/1/19 10:14
 */
public class ContainsNearbyDuplicateSolution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer pre = map.get(nums[i]);
            map.put(nums[i], i);
            if(pre != null && Math.abs(pre - i)<=k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(a, 1));
    }
}
