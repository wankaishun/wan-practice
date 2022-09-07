package com.wan.algorithm.array;

import java.util.*;

/**
 * @author wan
 * @Description: 两个数组交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * @date 2021/4/30 15:31
 */
public class IntersectSolution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i])+1);
            }else {
                map.put(nums1[i], 1);
            }

        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for(int i = 0; i<nums2.length; i++) {
           if(map.containsKey(nums2[i]) && map.get(nums2[i])>0) {
               map.put(nums2[i], map.get(nums2[i])-1);
               intersection[index++] = nums2[i];
           }
        }
        return Arrays.copyOfRange(intersection, 0, index);

    }

    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        intersect(a,b);
    }
}
