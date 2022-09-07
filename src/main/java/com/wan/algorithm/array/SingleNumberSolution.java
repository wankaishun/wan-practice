package com.wan.algorithm.array;

/**
 * @author wan
 * @Description: 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x21ib6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/4/30 15:05
 */
public class SingleNumberSolution {
    /*public int singleNumber(int[] nums) {
        HashSet hs = new HashSet();
        for(int i = 0; i<nums.length; i++) {
            if(!hs.add(nums[i])){
                hs.remove(nums[i]);
            }
        }
        Iterator<Integer> iterator = hs.iterator();
        return iterator.next();
    }*/
    public int singleNumber(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length; i++) {
           j = j^nums[i];
        }
        return j;
    }
}
