package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 474. 一和零
 * 给你一个二进制字符串数组 strs 和两个整数 m 和 n 。
 *
 * 请你找出并返回 strs 的最大子集的长度，该子集中 最多 有 m 个 0 和 n 个 1 。
 *
 * 如果 x 的所有元素也是 y 的元素，集合 x 是集合 y 的 子集 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：strs = ["10", "0001", "111001", "1", "0"], m = 5, n = 3
 * 输出：4
 * 解释：最多有 5 个 0 和 3 个 1 的最大子集是 {"10","0001","1","0"} ，因此答案是 4 。
 * 其他满足题意但较小的子集包括 {"0001","1"} 和 {"10","1","0"} 。{"111001"} 不满足题意，因为它含 4 个 1 ，大于 n 的值 3 。
 * 示例 2：
 *
 * 输入：strs = ["10", "0", "1"], m = 1, n = 1
 * 输出：2
 * 解释：最大的子集是 {"0", "1"} ，所以答案是 2 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ones-and-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/15 17:27
 */
public class FindMaxFormSolution {
    public static int findMaxForm(String[] strs, int m, int n) {
        int[] dp = new int[strs.length];
        int[] x = new int[strs.length];
        int[] y = new int[strs.length];
        x[0] = nums(strs[0], "0");
        y[0] = strs[0].length()-x[0];
        if(x[0]<=m && y[0]<=n) {
            dp[0] = 1;

        }else {
            dp[0] = 0;
        }
        for (int i = 1; i < strs.length; i++) {
            int zero = nums(strs[i], "0");
            int one = strs[i].length()-zero;
            if(x[i-1]+zero<=m && y[i-1]+one<=n) {
                x[i] = x[i-1] +zero;
                y[i] = y[i-1] +one;
                dp[i] = dp[i-1] + 1;
            }else {
                x[i] = x[i-1] ;
                y[i] = y[i-1] ;
                dp[i] = dp[i-1] ;
            }
        }
        return dp[strs.length-1];
    }
    public static int nums(String str,String key) {
        if(str == null || key == null || "".equals(str.trim()) || "".equals(key.trim())){
        return 0;
      }
        int count = 0;
        int index = 0;
        while((index=str.indexOf(key,index))!=-1){
        index = index+key.length();
        count++;
    }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"10", "0", "1"};
        System.out.println(findMaxForm(arr, 1,1));
    }
}
