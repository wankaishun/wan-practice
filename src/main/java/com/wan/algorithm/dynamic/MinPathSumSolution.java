package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 * 示例 2：
 *
 * 输入：grid = [[1,2,3],[4,5,6]]
 * 输出：12
 *  
 *
 * 提示：
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 200
 * 0 <= grid[i][j] <= 100
 * 通过次数254,275提交次数369,801
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/23 14:16
 */
public class MinPathSumSolution {
    public static int minPathSum(int[][] grid) {
        int[][] value = new int[grid.length][200];
        if(grid.length == 0) {
            return 0;
        }
        value[0][0] = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(j-1<0 && i-1<0) {
                    value[i][j] = value[0][0];
                }else if(j-1<0) {
                    value[i][j] = value[i-1][j] + grid[i][j];
                }else if(i-1<0) {
                    value[i][j] = value[i][j-1]+ grid[i][j];;
                }else {
                    value[i][j] = Math.min(value[i][j-1],value[i-1][j])+ grid[i][j];;
                }
            }
        }
        return value[grid.length -1][grid[grid.length -1].length-1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));

    }
}

