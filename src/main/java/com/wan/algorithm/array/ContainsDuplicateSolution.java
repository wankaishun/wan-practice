package com.wan.algorithm.array;

import java.util.HashSet;

/**
 * @author wan
 * @Description: 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/4/30 14:08
 */
public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        HashSet hs = new HashSet();
        for(int  i = 0; i<nums.length; i++) {
            if(!hs.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
