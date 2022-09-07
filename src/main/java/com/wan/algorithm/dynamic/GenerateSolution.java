package com.wan.algorithm.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan
 * @Description: 118. 杨辉三角
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 *
 *
 *
 *  
 *
 * 示例 1:
 *
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 示例 2:
 *
 * 输入: numRows = 1
 * 输出: [[1]]
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/27 9:32
 */
public class GenerateSolution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> item = new ArrayList();
        item.add(1);
        list.add(item);
        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = list.get(i-1);
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    curr.add(1);
                    continue;
                }
                curr.add(pre.get(j-1)+pre.get(j));
            }
            list.add(curr);

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
