package com.wan.algorithm.collection.algorithmbasis;

import java.util.Objects;

/**
 * @author wan
 * @Description: 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 *
 * 提示：
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 * @date 2021/9/9 9:54
 */
public class SearchRangeSolution {
//    public static int[] searchRange(int[] nums, int target) {
//        int i = 0;
//        int j = nums.length -1;
//        if(nums.length == 0) {
//            return new int[]{-1,-1};
//        }
//        while(true) {
//            if(nums[i] != target) {
//                i++;
//            }
//            if(nums[j] != target) {
//                j--;
//            }
//            if(i>j) {
//                return new int[]{-1,-1};
//            }
//           if(nums[i] == target && nums[j] == target) {
//               return new int[]{i,j};
//           }
//
//        }
//    }
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1 ;
        if(nums.length == 0) {
            return new int[]{-1,-1};
        }
        int middle = -1;
        while(true) {
             middle = (start+end)/2;
            if(nums[middle]< target) {
                start = middle;
            }
            if(nums[middle] > target) {
                end = middle;
            }
            if(nums[middle] == target) {
                break;
            }
            if((end-start)<=1  && nums[middle]!= target) {
                return new int[]{-1,-1};
            }

        }
       int a = middle;
        int b = middle;
        while(true) {
            if(nums[a] !=target && nums[b] !=target ) {
                return new int[]{a+1,b-1};
            }
            if(nums[a] ==target) {
                a = a-1;
            }
            if(nums[b] ==target) {
                b = b+1;
            }

        }
    }
    public static void main(String[] args) {
        Integer  a = 9527;
        Integer b = 9527;
        System.out.println(Objects.equals(a,b));
    }
}
