package com.wan.algorithm.dynamic;

import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wan
 * @Description: 646. 最长数对链
 * 给出 n 个数对。 在每一个数对中，第一个数字总是比第二个数字小。
 *
 * 现在，我们定义一种跟随关系，当且仅当 b < c 时，数对(c, d) 才可以跟在 (a, b) 后面。我们用这种形式来构造一个数对链。
 *
 * 给定一个数对集合，找出能够形成的最长数对链的长度。你不需要用到所有的数对，你可以以任何顺序选择其中的一些数对来构造。
 *
 *  
 *
 * 示例：
 *
 * 输入：[[1,2], [2,3], [3,4]]
 * 输出：2
 * 解释：最长的数对链是 [1,2] -> [3,4]
 *  
 *
 * 提示：
 *
 * 给出数对的个数在 [1, 1000] 范围内。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-length-of-pair-chain
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/3 10:07
 */
public class FindLongestChainSolution {
    public static int findLongestChain(int[][] pairs) {
//        int length = pairs.length;
//        int[] dp = new int[length];
//        Arrays.fill(dp, 1);
//        Arrays.sort(pairs, (a, b) ->a[0] -b[0]);
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < i; j++) {
//                if(pairs[j][1] < pairs[i][0]) {
//                    dp[i] = dp[j] +1;
//                }
//            }
//        }
//        int ans = 0;
//        for (int x: dp) if (x > ans) ans = x;
//        return ans;

        Arrays.sort(pairs, (a, b) ->a[1] -b[1]);
        int a = pairs[0][1];
        int length = pairs.length;
        int sum = 1;
        for (int i = 1; i < length; i++) {
           if(pairs[i][0]> a) {
              sum++;
              a = pairs[i][1];
           }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {{-10, -8}, {8, 9}, {-5, 0}, {
                6, 10
        }, {
                -6, -4
        },{ 1, 7
        }, {
                9, 10
        }, {
                -4, 7
        }};
        System.out.println(findLongestChain(a));
    }
}
