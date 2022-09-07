package com.wan.algorithm.everyday;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wan
 * @Description: 172. 阶乘后的零
 * 给定一个整数 n ，返回 n! 结果中尾随零的数量。
 *
 * 提示 n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：0
 * 解释：3! = 6 ，不含尾随 0
 * 示例 2：
 *
 * 输入：n = 5
 * 输出：1
 * 解释：5! = 120 ，有一个尾随 0
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/factorial-trailing-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/25 17:14
 */
public class TrailingZeroesSolution {
    // 6 5 4 3 2 1
    public static int trailingZeroes(int n) {
        if(n == 0) {
            return 1;
        }
        long result = n;
        while(n != 1) {
            result *=(n-1);
            n = n-1;
        }
        int size = 0;
        while(result %10 == 0) {
            size ++;
            result = result/10;
        }
        return size;
    }//4  5   6   7     8     9      10
    //24 120 720 5040 40320 362880 3628800
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "node", "www.wdbyte.com");
        Predicate<String> predicate1 = str -> str.length() == 4;
        Predicate<String> predicate2 = str -> str.length() > 4;
        list = list.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList());
        list.forEach(System.out::print);
    }
}
