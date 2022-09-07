package com.wan.algorithm.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wan
 * @Description: 120. 三角形最小路径和
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 *
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * 输出：11
 * 解释：如下面简图所示：
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * 示例 2：
 *
 * 输入：triangle = [[-10]]
 * 输出：-10
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/8 14:54
 */
public class MinimumTotalSolution {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] arr =  new int[size][size];
        if(size == 0) {
            return 0;
        }
        arr[0][0] = triangle.get(0).get(0);
        if(size ==1) {
            return arr[0][0];
        }

//        arr[1][0] = arr[0][0]+triangle.get(1).get(0);
//        arr[1][1] = arr[0][0]+triangle.get(1).get(1);
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> item = triangle.get(i);
            arr[i][0] = arr[i-1][0] +item.get(0);
            for (int j = 1; j < item.size()-1; j++) {
                arr[i][j] = Math.min(arr[i-1][j-1],arr[i-1][j]) +item.get(j);
            }
            arr[i][item.size()-1]  = arr[i-1][item.size()-2]+item.get(item.size()-1);
        }
        int min = Integer.MAX_VALUE;
        for (int i : arr[size - 1]) {
             min = Math.min(min,i);
        }
        return min;

    }

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(2);
        List list2 = new ArrayList();
        list2.add(3);
        list2.add(4);
        List list3 = new ArrayList();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List list4 = new ArrayList();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        List list = new ArrayList();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        System.out.println(minimumTotal(list));
    }
}
