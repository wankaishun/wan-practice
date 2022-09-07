package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：m = 3, n = 7
 * 输出：28
 * 示例 2：
 *
 * 输入：m = 3, n = 2
 * 输出：3
 * 解释：
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向下
 * 示例 3：
 *
 * 输入：m = 7, n = 3
 * 输出：28
 * 示例 4：
 *
 * 输入：m = 3, n = 3
 * 输出：6
 *  
 *
 * 提示：
 *
 * 1 <= m, n <= 100
 * 题目数据保证答案小于等于 2 * 109
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/23 10:28
 */
public class UniquePathsSolution {
    public static int uniquePaths(int m, int n) {
        if(m == 0 || n == 0) {
            return 0;
        }
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i-1 <0 && j-1>=0) {
                    arr[i][j] = arr[i][j-1];;
                }else if(j-1 <0 && i-1>=0) {
                    arr[i][j] = arr[i-1][j];
                }else if(i-1 <0 && j-1 <0)  {
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i-1][j]+arr[i][j-1];
                }

            }
        }
        arr[0][0] = 1;
        return arr[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(0, 0));
    }
}
