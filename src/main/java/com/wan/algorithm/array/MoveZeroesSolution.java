package com.wan.algorithm.array;

/**
 * @author wan
 * @Description: 移动0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2ba4i/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/8 16:29
 */
public class MoveZeroesSolution {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            if(item == 0) {
              j++;
            }else {
                nums[i-j] = nums[i];
            }
        }
        for (int i = j; i > 0; i--) {
            nums[nums.length-i] = 0;
        }

    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }

}
