package com.wan.algorithm.array;

/**
 * @author wan
 * @Description: 数组去重
 * @date 2021/4/27 16:15
 */
//1 1 2 3 5
//1 2 3 4 5
public class RemoveDuplicatesSolution {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1 || nums.length == 0) {
            return nums.length;
        }
        int before = 0;
        int after =  1;
        while(after != nums.length) {
            if(nums[before] == nums[after]) {
                after ++;
            }else {
                nums[before+1] = nums[after];
                before ++;
                after ++;
            }
        }
        return before+1;
    }

    public static void main(String args[]) {
        int[] i = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(i);
        System.out.println(result);
    }
}
