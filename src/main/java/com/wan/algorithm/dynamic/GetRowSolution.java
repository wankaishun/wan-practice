package com.wan.algorithm.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wan
 * @Description: 119. 杨辉三角 II
 * 示例 1:
 *
 * 输入: rowIndex = 3
 * 输出: [1,3,3,1]
 * 示例 2:
 *
 * 输入: rowIndex = 0
 * 输出: [1]
 * 示例 3:
 *
 * 输入: rowIndex = 1
 * 输出: [1,1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/9 11:27
 */
public class GetRowSolution {
    public static List<Integer> getRow(int rowIndex) {
        Integer[][] row = new Integer[rowIndex+1][rowIndex+1];
        row[0][0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            row[i][0] = 1;
            for (int j = 1; j < i; j++) {
                row[i][j] = row[i-1][j-1]+row[i-1][j];
            }
            row[i][i] = 1;
        }

        return Arrays.asList(row[rowIndex]);
    }

    public static void main(String[] args) {
        System.out.println(getRow(0));
    }
}
