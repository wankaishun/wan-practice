package com.wan.algorithm.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wan
 * @Description: 1200. 最小绝对差
 * 给你个整数数组 arr，其中每个元素都 不相同。
 *
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 * 示例 2：
 *
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 * 示例 3：
 *
 * 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * 输出：[[-14,-10],[19,23],[23,27]]
 * @date 2022/7/4 10:23
 */
public class MinimumAbsDifferenceSolution {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int pre = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();
        if(arr.length == 0) {
            return list;
        }
        for (int i = 1; i < arr.length; i++) {
            int value = Math.abs(arr[i] - arr[i-1]);
            if(value < pre) {
                list.clear();
            }
            if(value <= pre){
                List<Integer> item = new ArrayList<>();
                item.add(arr[i-1]);
                item.add(arr[i]);
                list.add(item);
                pre = value;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        List<List<Integer>> list =  minimumAbsDifference(arr);
        for (List<Integer> integers : list) {
            System.out.println(integers.toString());
        }
    }
}
