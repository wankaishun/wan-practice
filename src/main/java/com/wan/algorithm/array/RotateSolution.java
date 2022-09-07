package com.wan.algorithm.array;

/**
 * @author wan
 * @Description: 数组反转
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 进阶：
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @date 2021/4/29 16:31
 */
public class RotateSolution {
    public static void rotate(int[] nums, int k) {
        int lenght = nums.length;
        for(int i =0; i<nums.length/2;i++) {
            int value = nums[i];
            nums[i] = nums[lenght-i-1];
            nums[lenght-i-1] = value;
        }
        if(k<lenght) {
            k = k;
        }else {
            k = k%lenght;
        }
        for(int i =0; i<lenght;i++) {
            if(i<k/2) {
                int value = nums[i];
                nums[i] = nums[k-i-1];
                nums[k-i-1] = value;
            }
            if(i>=k && i< (lenght+k)/2) {
                int value = nums[i];
                nums[i] = nums[lenght-1-i+k];
                nums[lenght-1-i+k] = value;
            }
        }

        for (int a: nums) {
            System.out.print(" "+
                    a);
        }
    }
    public static void main(String args[]) {
        int [] param = {1,2,3,4,5,6,7};
        rotate(param,3);
    }
}
